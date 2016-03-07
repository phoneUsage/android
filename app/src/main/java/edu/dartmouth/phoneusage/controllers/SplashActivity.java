package edu.dartmouth.phoneusage.controllers;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.utils.ParseUtils;

/**
 * Created by hunterestrada on 3/6/16.
 */
public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        ParseUtils.getStatsInfo(this);
    }

    void onParseLoaded() {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPreferences.edit().putBoolean(getString(R.string.key_for_first_launch), false).commit();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
