package edu.dartmouth.phoneusage.controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.models.data_sources.BaseDataSource;
import edu.dartmouth.phoneusage.utils.ParseUtils;

/**
 * Created by hunterestrada on 3/6/16.
 */
public class SplashActivity extends Activity {

    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // View view = inflater.inflate(R.layout.preference_seekbar, parent, false);
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        ParseUtils.getStatsInfo(this, new BaseDataSource.CompletionHandler<Boolean>() {
            @Override
            public void onTaskCompleted(Boolean success) {

                if (success) {

                } else {

                }

            }
        });
    }
}
