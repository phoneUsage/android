package edu.dartmouth.goyp.watch.controllers;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import edu.dartmouth.goyp.watch.R;

public class MainActivity extends Activity {

	private static final String TAG = "SVB-WatchMain";
	private static final String UNLOCKS_KEY = "phoneusage.key.unlocks";
	private static final String USAGE_KEY = "phoneusage.key.usage";

	public static final String DATA_UPDATE_ACTION = "data_update_action";

	private DataUpdateReceiver mDataUpdateReceiver;

	private TextView mUnlocksText;
	private TextView mUsageText;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
		stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
			@Override
			public void onLayoutInflated(WatchViewStub watchViewStub) {
				mUnlocksText = (TextView) stub.findViewById(R.id.unlocks_text);
				mUsageText = (TextView) stub.findViewById(R.id.usage_text);
				updateUI();
			}
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onResume() {
		Log.d(TAG, "onResume");
		super.onResume();
		initDataUpdateReceiver();
	}

	@Override
	protected void onStop() {
		Log.d(TAG, "onStop");
		super.onStop();
		unregisterReceiver(mDataUpdateReceiver);
	}

	// **************** BroadcastReceiver Implementation + Initialization ************************//

	public class DataUpdateReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			updateUI();
		}
	}

	/**
	 * Initialize and register the BroadcastReceiver that listens for data updates.
	 */
	private void initDataUpdateReceiver() {
		Log.d(TAG, "initDataUpdateReceiver");
		mDataUpdateReceiver = new DataUpdateReceiver();
		IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction(DATA_UPDATE_ACTION);
		registerReceiver(mDataUpdateReceiver, intentFilter);
	}

	// ******************************* Private Helper Functions **********************************//

	private void updateUI() {
		Log.d(TAG, "Updating Values");
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getApplicationContext());
		long unlocks = sharedPreferences.getLong(UNLOCKS_KEY, 0);
		long usage = sharedPreferences.getLong(USAGE_KEY, 0);
		updateUnlocks(unlocks);
		updateUsage(usage);
	}

	private void updateUnlocks(long unlocks) {
		String unlocksString = String.valueOf(unlocks);
		mUnlocksText.setText(unlocksString);
	}

	private void updateUsage(long usage) {
		float hours = getHoursFromMillis(usage);
		mUsageText.setText(String.valueOf(hours));
	}

	/**
	 * Return milliseconds converted to hours rounded to 2 decimal places.
	 */
	private float getHoursFromMillis(long millis) {
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
		float hours = minutes / 60.0f;
		return Math.round(hours * 100.0f) / 100.0f;
	}
}

