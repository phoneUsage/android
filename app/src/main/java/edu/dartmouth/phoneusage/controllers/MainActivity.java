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

import com.parse.FunctionCallback;
import com.parse.ParseCloud;
import com.parse.ParseException;

import java.util.ArrayList;
import java.util.HashMap;

import edu.dartmouth.phoneusage.utils.MidnightScheduler;
import edu.dartmouth.phoneusage.utils.UsageBroadcastReceiver;
import edu.dartmouth.phoneusage.utils.UsageService;
import edu.dartmouth.phoneusage.views.SlidingTabLayout;
import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.views.ActionTabsViewPagerAdapter;

public class MainActivity extends Activity {
	private SlidingTabLayout slidingTabLayout;
	private ViewPager viewPager;
	private ArrayList<Fragment> fragments;
	private ActionTabsViewPagerAdapter myViewPageAdapter;

	int mPercentage;
	int mUnlocks;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

    // launch background service that maintains broadcast rx
    Intent usageIntent = new Intent(this, UsageService.class);
    startService(usageIntent);

		setupTabs();
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

	@Override // update UI of all fragments when visible again
	protected void onResume() {
		Log.d("MainActivity", "onResume");
		super.onResume();

		for (Fragment fragment : fragments) {
			((UpdatableFragment) fragment).updateUI();
		}
	}
}
