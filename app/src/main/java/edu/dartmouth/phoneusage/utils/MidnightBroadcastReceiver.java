package edu.dartmouth.phoneusage.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import edu.dartmouth.phoneusage.R;

/**
 * Created by hunterestrada on 3/2/16.
 */
public class MidnightBroadcastReceiver extends BroadcastReceiver {
    private SharedPreferences mSharedPreferences;
    private String mDurationKey;
    private String mLimitationKey;
    private String mUnlocksKey;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(getClass().getName(), "received midnight request");

        // TODO: unregister UsageBroadcastReceiver

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mDurationKey = context.getString(R.string.key_for_daily_duration);
        mLimitationKey = context.getString(R.string.key_for_daily_limitation);
        mUnlocksKey = context.getString(R.string.key_for_daily_unlocks);

        // TODO: upload to Parse, reset mSharedPreferences

        // TODO: register UsageBroadcastReceiver
    }
}
