package edu.dartmouth.phoneusage.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Calendar;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.models.classes.LocalDailyUsageEntry;
import edu.dartmouth.phoneusage.models.classes.UnlockLockEvent;
import edu.dartmouth.phoneusage.models.data_sources.BaseDataSource;
import edu.dartmouth.phoneusage.models.data_sources.UnlockLockEventDataSource;

/**
 * Created by hunterestrada on 2/28/16.
 */
public class UsageBroadcastReceiver extends BroadcastReceiver {
    private long unlockDateTime = -1;
    private GoogleApiClient mGoogleApiClient; // For watch

    public UsageBroadcastReceiver(GoogleApiClient apiClient) {
        mGoogleApiClient = apiClient;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String durationKey = context.getString(R.string.key_for_daily_duration);
        String unlocksKey = context.getString(R.string.key_for_daily_unlocks);

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

//            ParseUtils.getStatsInfo(context);

            // TODO: add method to upload/reset data

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

        if (mGoogleApiClient.isConnected()) {
            Log.d("SVB-UsageBR", "Updating watch data");
            WatchUtil.createDataMap(mGoogleApiClient, sharedPreferences.getLong(unlocksKey, 0),
                    sharedPreferences.getLong(durationKey, 0));
        }
    }


    // restores default values to shared preferences
    private void refreshPreferences(SharedPreferences preferences, String durationKey, String unlocksKey) {
        preferences.edit().putLong(durationKey, 0).apply();
        preferences.edit().putLong(unlocksKey, 0).apply();
    }
}
