package edu.dartmouth.phoneusage.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Wearable;

import java.util.Calendar;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.models.classes.LocalDailyUsageEntry;
import edu.dartmouth.phoneusage.models.classes.UnlockLockEvent;
import edu.dartmouth.phoneusage.models.data_sources.BaseDataSource;
import edu.dartmouth.phoneusage.models.data_sources.LocalDailyUsageEntryDataSource;
import edu.dartmouth.phoneusage.models.data_sources.UnlockLockEventDataSource;


/**
 * Created by hunterestrada on 2/28/16.
 */
public class UsageBroadcastReceiver extends BroadcastReceiver {
    private static String TAG = "SVB-UsageBR";

    private long unlockDateTime = -1;
    private GoogleApiClient mGoogleApiClient; // For watch

    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String durationKey = context.getString(R.string.key_for_daily_duration);
        String unlocksKey = context.getString(R.string.key_for_daily_unlocks);
        String limitKey = context.getString(R.string.key_for_daily_limitation);

        // MIDNIGHT SCHEDULER
        if (intent.getAction() == null) {
            // upload data to Parse and reset local preferences at midnight
            Log.d(getClass().getName(), "received midnight request");

            // temporarily save before clearing preferences
            long dailyDuration = sharedPreferences.getLong(durationKey, 0);
            long dailyUnlocks = sharedPreferences.getLong(unlocksKey, 0);
            ParseUtils.addInfoToParse(dailyDuration, dailyUnlocks);

            // clear preferences to prepare for next day
            refreshPreferences(sharedPreferences, durationKey, unlocksKey);
            unlockDateTime = -1;


            // Save the LocalDailyUsageEntry for today to the local db.
            LocalDailyUsageEntry localUsageEntry = new LocalDailyUsageEntry();
            localUsageEntry.setTotalUnlocks((int) dailyUnlocks);
            localUsageEntry.setTotalUsageMS(dailyDuration);
            localUsageEntry.setDateTimeMS(Calendar.getInstance().getTimeInMillis());
            localUsageEntry.setGoalHoursMS(sharedPreferences.getLong(limitKey, 0));
            LocalDailyUsageEntryDataSource.getInstance(context).saveLocalDailyUsageEntry(
                    localUsageEntry, new BaseDataSource.CompletionHandler<LocalDailyUsageEntry>() {
                        @Override
                        public void onDbTaskCompleted(LocalDailyUsageEntry result) {
                            Log.d(TAG, "Saved local entry: " + result);
                        }
                    });


            ParseUtils.getStatsInfo(context);



        // SCREEN UNLOCK
        } else if (intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {
            // start duration and increment unlocks when screen unlock
            long totalUnlocks = sharedPreferences.getLong(unlocksKey, 0);
            sharedPreferences.edit().putLong(unlocksKey, ++totalUnlocks).apply();
            Log.d(getClass().getName(), "unlocked: " + String.valueOf(totalUnlocks));

            unlockDateTime = Calendar.getInstance().getTimeInMillis();

        // SCREEN OFF
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF) && unlockDateTime > 0) {
            // stop and save duration when screen lock
            long lockDateTime = Calendar.getInstance().getTimeInMillis();
            long currentDuration = lockDateTime - unlockDateTime;
            long totalDuration = sharedPreferences.getLong(durationKey, 0) + currentDuration;

            // save in shared preferences
            sharedPreferences.edit().putLong(durationKey, totalDuration).apply();
            // save in local database
            UnlockLockEvent event = new UnlockLockEvent(-1, unlockDateTime, lockDateTime);
            UnlockLockEventDataSource.getInstance(context).saveUnlockLockEvent(event,
                    new BaseDataSource.CompletionHandler<UnlockLockEvent>() {
                        @Override
                        public void onDbTaskCompleted(UnlockLockEvent result) {
                            Log.d(getClass().getName(), "saved: " + result.toString());
                        }
                    });

            unlockDateTime = -1; // prepare for next duration

        // PHONE SHUTDOWN
        } else if (intent.getAction().equals(Intent.ACTION_SHUTDOWN) && unlockDateTime > 0) {
            // stop and save duration when power off
            long lockDateTime = Calendar.getInstance().getTimeInMillis();
            long currentDuration = lockDateTime - unlockDateTime;
            long totalDuration = sharedPreferences.getLong(durationKey, 0) + currentDuration;

            // save in shared preferences
            sharedPreferences.edit().putLong(durationKey, totalDuration).apply();
            // save in local database
            UnlockLockEvent event = new UnlockLockEvent(-1, unlockDateTime, lockDateTime);
            UnlockLockEventDataSource.getInstance(context).saveUnlockLockEvent(event,
                    new BaseDataSource.CompletionHandler<UnlockLockEvent>() {
                        @Override
                        public void onDbTaskCompleted(UnlockLockEvent result) {
                            Log.d(getClass().getName(), "saved: " + result.toString());
                        }
                    });

            unlockDateTime = -1; // prepare for next duration
        }

        if (mGoogleApiClient == null || !mGoogleApiClient.isConnected()) {
            Log.d(TAG, "Setting up watch API client.");
            setupWatchDataAPI(context.getApplicationContext());
        } else {
            Log.d("SVB-UsageBR", "Updating watch data");
            sendWatchData(context);
        }
    }

    // restores default values to shared preferences
    private void refreshPreferences(SharedPreferences preferences, String durationKey, String unlocksKey) {
        preferences.edit().putLong(durationKey, 0).apply();
        preferences.edit().putLong(unlocksKey, 0).apply();
    }

    private void setupWatchDataAPI(final Context context) {
        mGoogleApiClient = new GoogleApiClient.Builder(context)
                .addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks() {
                    @Override
                    public void onConnected(@Nullable Bundle bundle) {
                        Log.d(TAG, "onConnected. Bundle: " + bundle);
                        // Send data immediately after connecting.
                        sendWatchData(context);
                    }

                    @Override
                    public void onConnectionSuspended(int i) {
                        Log.d(TAG, "onConnectionSuspended " + i);
                    }
                })
                .addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() {
                    @Override
                    public void onConnectionFailed(ConnectionResult connectionResult) {
                        Log.d(TAG, "onConnectionFailed: " + connectionResult);
                    }
                })
                .addApi(Wearable.API)
                .build();
        mGoogleApiClient.connect();
    }

    private void sendWatchData(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        long usage = prefs.getLong(context.getString(R.string.key_for_daily_duration), 0);
        long unlocks = prefs.getLong(context.getString(R.string.key_for_daily_unlocks), 0);
        long limit = prefs.getLong(context.getString(R.string.key_for_daily_limitation), 0);
        WatchUtil.createDataMap(mGoogleApiClient, unlocks, usage, limit);
    }
}
