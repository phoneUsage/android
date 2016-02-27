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
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import edu.dartmouth.phoneusage.views.SlidingTabLayout;
import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.views.ActionTabsViewPagerAdapter;

public class MainActivity extends Activity {
	private SlidingTabLayout slidingTabLayout;
	private ViewPager viewPager;
	private ArrayList<Fragment> fragments;
	private ActionTabsViewPagerAdapter myViewPageAdapter;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

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

}

