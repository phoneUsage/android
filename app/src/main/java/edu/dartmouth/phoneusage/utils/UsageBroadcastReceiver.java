package edu.dartmouth.phoneusage.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import java.util.Calendar;

import edu.dartmouth.phoneusage.R;

/**
 * Created by hunterestrada on 2/28/16.
 */
public class UsageBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "UBR";

    private String mDurationKey;
    private String mUnlocksKey;
    private SharedPreferences mSharedPreferences;
    private long unlockDateTime = 0;

    public UsageBroadcastReceiver(Context context) {
        mDurationKey = context.getString(R.string.key_for_daily_duration);
        mUnlocksKey = context.getString(R.string.key_for_daily_unlocks);
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {
            // start duration and increment unlocks when screen unlock
            long totalUnlocks = mSharedPreferences.getLong(mUnlocksKey, 0);
            mSharedPreferences.edit().putLong(mUnlocksKey, ++totalUnlocks).apply();
            Log.d(TAG, "unlocked: " + String.valueOf(totalUnlocks));

            unlockDateTime = Calendar.getInstance().getTimeInMillis();

        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF) && unlockDateTime > 0) {
            // stop and save duration when screen lock
            long duration = Calendar.getInstance().getTimeInMillis() - unlockDateTime;
            long totalDuration = mSharedPreferences.getLong(mDurationKey, 0);
            mSharedPreferences.edit().putLong(mDurationKey, duration + totalDuration).apply();

            Log.d(TAG, "locked: " + String.valueOf(duration / 1000) + " sec");
            unlockDateTime = 0; // prepare for next duration

        } else if (unlockDateTime > 0) { // shutdown
            // stop and save duration when power off
            long duration = Calendar.getInstance().getTimeInMillis() - unlockDateTime;
            long totalDuration = mSharedPreferences.getLong(mDurationKey, 0);
            mSharedPreferences.edit().putLong(mDurationKey, duration + totalDuration).apply();

            Log.d(TAG, "shutdown: " + String.valueOf(duration / 1000) + " sec");
            unlockDateTime = 0; // prepare for next duration
        }

    }
}
