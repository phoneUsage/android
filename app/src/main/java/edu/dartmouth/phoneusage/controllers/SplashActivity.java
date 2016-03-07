package edu.dartmouth.phoneusage.controllers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;


import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.models.data_sources.BaseDataSource;
import edu.dartmouth.phoneusage.utils.ParseUtils;

/**
 * Created by hunterestrada on 3/6/16.
 */
public class SplashActivity extends Activity {
    SharedPreferences mSharedPreferences;
    TextView mMessageTextView;
    ProgressBar mProgressSpinner;
    Button mReloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        mMessageTextView = (TextView) findViewById(R.id.splashMessage);
        mProgressSpinner = (ProgressBar) findViewById(R.id.splashProgress);
        mReloadButton = (Button) findViewById(R.id.splashRetryButton);

        mMessageTextView.setText(LOADING_MESSAGE);
        mProgressSpinner.getIndeterminateDrawable().setColorFilter(getResources().getColor(android.R.color.holo_green_dark),
                android.graphics.PorterDuff.Mode.SRC_IN);
        mReloadButton.setVisibility(View.INVISIBLE);

        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        if (sharedPreferences.getBoolean(getString(R.string.key_for_first_launch), false)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        loadUsageInformation();
    }

    private void loadUsageInformation() {
        ParseUtils.getStatsInfo(this, new BaseDataSource.CompletionHandler<Boolean>() {
            @Override
            public void onTaskCompleted(Boolean success) {

                if (success) {
                    Log.d(getClass().getName(), "SPLASH SUCCESS");
                    mSharedPreferences.edit().putBoolean(getString(R.string.key_for_first_launch), true).commit();

                    transitionToMainActivity();

                } else {
                    Log.d(getClass().getName(), "SPLASH FAILURE");
                    mProgressSpinner.setVisibility(View.INVISIBLE);
                    mMessageTextView.setText(ERROR_MESSAGE);
                    mReloadButton.setVisibility(View.VISIBLE);
                }

            }
        });

    }

    private void transitionToMainActivity() {
        final Intent intent = new Intent(this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 3000);

    }

    public void onClickReload(View v) {
        mMessageTextView.setText(LOADING_MESSAGE);
        mProgressSpinner.setVisibility(View.VISIBLE);
        mReloadButton.setVisibility(View.INVISIBLE);

        loadUsageInformation();
    }

    private static final String LOADING_MESSAGE = "Loading phone usage information.";
    private static final String ERROR_MESSAGE = "Could not load phone usage information.\nConnect to the internet and try again.";
}
