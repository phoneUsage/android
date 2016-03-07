/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package edu.dartmouth.phoneusage.controllers;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;

import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.util.Log;

import android.widget.Toast;

import java.util.ArrayList;

import edu.dartmouth.phoneusage.models.classes.VoiceVoter;
import edu.dartmouth.phoneusage.utils.Context_Service;
import edu.dartmouth.phoneusage.utils.ParseUtils;
import edu.dartmouth.phoneusage.utils.UsageService;
import edu.dartmouth.phoneusage.views.SlidingTabLayout;
import edu.dartmouth.phoneusage.R;
import edu.dartmouth.phoneusage.views.ActionTabsViewPagerAdapter;
import edu.dartmouth.phoneusage.views.VoiceDialogFragment;

public class MainActivity extends Activity {
	private SlidingTabLayout slidingTabLayout;
	private ViewPager viewPager;
	private ArrayList<Fragment> fragments;
	private ActionTabsViewPagerAdapter myViewPageAdapter;
	private SharedPreferences prefs;

	int mPercentage;
	int mUnlocks;

	private boolean microphoneStarted = false;

	/**
	 * Messenger service for exchanging messages with the background service
	 */
	private Messenger mVoiceService = null;
	/**
	 * Variable indicating if this activity is connected to the service
	 */
	private boolean mIsBound;

	/**
	 * Messenger receiving messages from the background service to update UI
	 */
	private final Messenger mMessenger = new Messenger(new IncomingHandler());

	private VoiceVoter voiceVoter = new VoiceVoter();

	Thread mVoiceThread;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("SVB-MainActivity", "onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		prefs = PreferenceManager.getDefaultSharedPreferences(this);


		// launch background service that maintains lock/unlock broadcast rx
		Intent usageIntent = new Intent(this, UsageService.class);
		startService(usageIntent);



		startContextService();
		setupTabs();

		//TODO remove this!
		ParseUtils.getStatsInfo(this);
	}

	private void startContextService() {
		//Start Background Service if not already started
		if (!Context_Service.isRunning()) {
			Intent cssBg = new Intent(this, Context_Service.class);
			startService(cssBg);
			Log.d("MainAccc","started service");
		}
		//Bind to the service if it is already running
		bindToVoiceServiceIfIsRunning();
		microphoneStarted = false;
		if (Context_Service.isMicrophoneRunning()) {
			Log.d("MainAcc", "microphone running");
			microphoneStarted = true;
		}
		//doBindService();
	}

	private void stopContextService(){
		if(Context_Service.isRunning()){
			if(mIsBound){
				unbindService(mConnection);
			}

		}
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

        Handler delayedHandler = new Handler();
        // delay UI call to ensure views are redrawn
		for (final Fragment fragment : fragments) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    ((UpdatableFragment) fragment).updateUI();
                }
            };
			delayedHandler.postDelayed(r, 1000);
		}
		if(prefs.getBoolean("ANTISOCIAL_ALERTS", false)) {
			startMicrophone();
			mVoiceThread = new VoiceThread();
			mVoiceThread.start();
		}
	}

	/**
	 * Handler to handle incoming messages
	 */
	@SuppressLint("HandlerLeak")
	class IncomingHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			Log.d("MainAcc", "gotMessage");
			switch (msg.what) {
				case Context_Service.MSG_MICROPHONE_STARTED:
				{
					Toast.makeText(getApplicationContext(), "microphone started", Toast.LENGTH_SHORT).show();
					Log.d("Handler", "microphone started");
					break;
				}
				case Context_Service.MSG_MICROPHONE_STOPPED:
				{
					Toast.makeText(getApplicationContext(), "microphone stopped", Toast.LENGTH_SHORT).show();
					Log.d("Handler", "microphone stopped");
					break;
				}
				case Context_Service.MSG_SPEECH_STATUS:
				{
					Integer speech = msg.getData().getInt("speech");

					//Log.d("speech", "speech in main: "+speech);
					if (speech==1.0) {
						voiceVoter.incrementSpeech();
						Log.d("Handler", "got speech data");
					}
					else {
						voiceVoter.incrementNoise();
						Log.d("Handler", "got noise data");
					}

					//statusSpeechView.setText(""+speech);
					break;
				}
				default:
					super.handleMessage(msg);
			}
		}
	}

	/**
	 * Connection with the service
	 */
	private ServiceConnection mConnection = new ServiceConnection() {
		public void onServiceConnected(ComponentName className, IBinder service) {
			mVoiceService = new Messenger(service);
			Log.d("Tagg", "Attached to the Service");
			mIsBound = true;
			if(!Context_Service.isMicrophoneRunning()){
				startMicrophone();
			}

			try {
				Message msg = Message.obtain(null, Context_Service.MSG_REGISTER_CLIENT);
				msg.replyTo = mMessenger;
				mVoiceService.send(msg);
			} catch (RemoteException e) {
				// In this case the service has crashed before we could even do anything with it
			}
		}

		public void onServiceDisconnected(ComponentName className) {
			// This is called when the connection with the service has been unexpectedly disconnected - process crashed.
			mIsBound = false;
			mVoiceService = null;
			Log.d("tagg", "Disconnected from the Service");
		}
	};

	@Override
	protected void onDestroy() {
		super.onDestroy();
		stopContextService();
		stopMicrophone();
		try {
			doUnbindService();
		} catch (Throwable t) {
			Log.e("MainActivity", "Failed to unbind from the service", t);
		}
		if (mVoiceService != null) {
			try {
				Message msg = Message.obtain(null, Context_Service.MSG_UNREGISTER_CLIENT);
				msg.replyTo = mMessenger;
				mVoiceService.send(msg);
			} catch (RemoteException e) {
				// There is nothing special we need to do if the service has crashed.
			}
		}
	}

	@Override
	protected void onPause() {
		super.onPause();
		if(mVoiceThread!=null && mVoiceThread.isAlive()){
			mVoiceThread.interrupt();
		}
	}


	/**
	 * Binds this activity to the service if the service is already running
	 */
	private void bindToVoiceServiceIfIsRunning() {
		//If the service is running when the activity starts, we want to automatically bind to it.
		if (Context_Service.isRunning()) {
			doBindService();//
			Log.d("tagg", "Request to bind service");
		}
	}

	/**
	 * This method is required to send a request to the background service.
	 * In current application, we are not sending any message yet.
	 * @param message
	 */
	private void sendMessageToService(int message) {
		if (mIsBound) {
			if (mVoiceService != null) {
				try {
					Message msg = Message.obtain(null, message);
					msg.replyTo = mMessenger;
					mVoiceService.send(msg);
					Log.d("SendMessage", String.valueOf(message));
				} catch (RemoteException e) {
				}
			}
		}
	}

	/**
	 * Binds the activity to the background service
	 */
	void doBindService() {
		bindService(new Intent(this, Context_Service.class), mConnection, Context.BIND_AUTO_CREATE);
		Log.d("tagg","Binding to Service");
	}

	/**
	 * Unbind this activity from the background service
	 */
	void doUnbindService() {
		if (mIsBound) {
			// Detach our existing connection.
			unbindService(mConnection);
			Log.d("tagg", "Unbinding from Service");
		}
	}

	/**
	 * Sends Microphone Start Request
	 */
	private void startMicrophone() {
		Log.d("MainAcc", "StartMic called");
		if(!mIsBound) {
			Log.d("MainAcc", "StartMic isntBound");
			doBindService();
		}
		if(mIsBound) {
			Log.d("MainAcc", "StartMic isBound");
			sendMessageToService(Context_Service.MSG_START_MICROPHONE);
		}
	}

	/**
	 * Sends Microphone Stop Request
	 */
	private void stopMicrophone() {
		if(mIsBound) {
			sendMessageToService(Context_Service.MSG_STOP_MICROPHONE);
		}
	}
	public void restartVoiceThread(){
		startMicrophone();
		mVoiceThread = new VoiceThread();
		mVoiceThread.start();
	}

	public void stopVoiceThread(){
		mVoiceThread.interrupt();
		stopMicrophone();
	}

	public class VoiceThread extends Thread {

		@Override
		public void run() {
			voiceVoter.reset();
			Log.d("VoiceThread", "started");
			while(!isInterrupted()) {
				if (voiceVoter.pollVoter() == 1) {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							new VoiceDialogFragment().show(getFragmentManager(), "voiceDialog");
						}
					});
				}
				voiceVoter.reset();
				try {
					sleep(5000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
					interrupt();
				}
			}
		}
	}

}
