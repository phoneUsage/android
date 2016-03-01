/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package edu.dartmouth.phoneusage.controllers;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.Toast;

import java.util.ArrayList;

import edu.dartmouth.phoneusage.utils.UsageBroadcastReceiver;
import edu.dartmouth.phoneusage.views.SlidingTabLayout;
import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.views.ActionTabsViewPagerAdapter;

public class MainActivity extends Activity {
	private SlidingTabLayout slidingTabLayout;
	private ViewPager viewPager;
	private ArrayList<Fragment> fragments;
	private ActionTabsViewPagerAdapter myViewPageAdapter;
	private static final int STATUS_BAR_NOTIFICATION = 0;
	public NotificationManager nm;
	int mPercentage;
	int mUnlocks;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setupTabs();
		registerUsageBroadcastReceiver();
		setupNotification();
	}

	/*helper functions*/

	//set up tabs with fragments
	private void setupTabs(){
		// Define SlidingTabLayout (shown at top)
		// and ViewPager (shown at bottom) in the layout.
		// Get their instances.
		slidingTabLayout = (SlidingTabLayout) findViewById(R.id.tab);
		viewPager = (ViewPager) findViewById(R.id.viewpager);

		// create a fragment list in order.
		fragments = new ArrayList<Fragment>();
		fragments.add(new TodayFragment());
		fragments.add(new WeekFragment());
		fragments.add(new SettingsFragment());

		// use FragmentPagerAdapter to bind the slidingTabLayout (tabs with different titles)
		// and ViewPager (different pages of fragment) together.
		myViewPageAdapter = new ActionTabsViewPagerAdapter(getFragmentManager(),
				fragments);
		viewPager.setAdapter(myViewPageAdapter);

		// make sure the tabs are equally spaced.
		slidingTabLayout.setDistributeEvenly(true);
		slidingTabLayout.setViewPager(viewPager);
	}

    private void registerUsageBroadcastReceiver() {
        UsageBroadcastReceiver ubc = new UsageBroadcastReceiver(this);
        registerReceiver(ubc, new IntentFilter(Intent.ACTION_USER_PRESENT));
        // registerReceiver(ubc, new IntentFilter(Intent.ACTION_SCREEN_ON));
        registerReceiver(ubc, new IntentFilter(Intent.ACTION_SCREEN_OFF));
        registerReceiver(ubc, new IntentFilter(Intent.ACTION_SHUTDOWN));
    }

	// displays usage on the lock screen with a notification
	private void setupNotification(){
		nm = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
		CharSequence tickerText = "hello";
		long when = System.currentTimeMillis();
		final Notification noti = new Notification(R.mipmap.ic_launcher, tickerText, when);
		Context context = this.getApplicationContext();
		Intent notiIntent = new Intent(context, MainActivity.class);
		PendingIntent pi = PendingIntent.getActivity(context, 0, notiIntent, 0);
		noti.flags |= Notification.FLAG_ONGOING_EVENT;
		final RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.notification);
		contentView.setImageViewResource(R.id.status_icon, R.mipmap.ic_launcher);
		noti.contentView = contentView;
		noti.contentIntent = pi;
		nm.notify(STATUS_BAR_NOTIFICATION, noti);

        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


		new Thread(new Runnable() {
			public void run() {


//              mPercentage = 45;
//				mUnlocks = 60;
				boolean mRun = true;
				while (mRun) {
                    long duration = sharedPreferences.getLong(getString(R.string.key_for_daily_duration), 0);
                    long limitation = sharedPreferences.getLong(getString(R.string.key_for_daily_limitation), 8800000);

                    // values to display on notification banner
                    float percentage = ((float) duration / (float) limitation) * 100;
                    long hours = (duration / 3600000) % 24;
                    long minutes = (duration / 60000) % 60;
                    long unlocks = sharedPreferences.getLong(getString(R.string.key_for_daily_unlocks), 0);


                    String usageText = String.format("Usage: %.2f%% @ %d h %02d m\nUnlocks: %d", percentage, hours, minutes, unlocks);
					// CharSequence title =  mPercentage +  "%, 60 unlocks";
					noti.contentView.setTextViewText(R.id.status_text, usageText);
					noti.contentView.setProgressBar(R.id.progressBar, 100, (int) (percentage), false);
					if(mPercentage>=100){
						noti.contentView.setProgressBar(R.id.full_progressBar, 100, 100, false);
					}

					nm.notify(STATUS_BAR_NOTIFICATION, noti);
					SystemClock.sleep(10000);
				}
			}
		}).start();
	}

    @Override // update UI of all fragments when visible again
    protected void onStart() {
        super.onStart();
        for (Fragment fragment : fragments) {
            ((UpdatableFragment) fragment).updateUI();
        }
    }
}

