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

    private String mKey;
    private SharedPreferences mSharedPreferences;
    private long unlockDateTime = 0;

    public UsageBroadcastReceiver(Context context) {
        mKey = context.getString(R.string.key_for_daily_duration);
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: filter between

        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // start duration when screen on
            unlockDateTime = Calendar.getInstance().getTimeInMillis();

        } else if (intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {
            // start duration when screen unlock
            unlockDateTime = Calendar.getInstance().getTimeInMillis();

        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF) && unlockDateTime > 0) {
            // stop and save duration when screen lock
            long duration = Calendar.getInstance().getTimeInMillis() - unlockDateTime;
            long total = mSharedPreferences.getLong(mKey, 0);
            mSharedPreferences.edit().putLong(mKey, duration + total).apply();

            Log.d(TAG, "locked: " + String.valueOf(duration / 1000) + " sec");
            unlockDateTime = 0; // prepare for next duration

        } else if (unlockDateTime > 0) { // shutdown
            // stop and save duration when power off
            long duration = Calendar.getInstance().getTimeInMillis() - unlockDateTime;
            long total = mSharedPreferences.getLong(mKey, 0);
            mSharedPreferences.edit().putLong(mKey, duration + total).apply();

            Log.d(TAG, "shutdown: " + String.valueOf(duration / 1000) + " sec");
            unlockDateTime = 0; // prepare for next duration
        }

    }
}
