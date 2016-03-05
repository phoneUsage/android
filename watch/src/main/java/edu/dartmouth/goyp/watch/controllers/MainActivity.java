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

import com.github.lzyzsd.circleprogress.ArcProgress;

import edu.dartmouth.goyp.watch.R;
import edu.dartmouth.goyp.watch.util.Globals;

public class MainActivity extends Activity {

	private static final String TAG = "SVB-WatchMain";

	public static final String DATA_UPDATE_ACTION = "data_update_action";

	private DataUpdateReceiver mDataUpdateReceiver;

	private TextView mUnlocksText;
	private ArcProgress mUsageProgessArc;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "onCreate");
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
		stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
			@Override
			public void onLayoutInflated(WatchViewStub watchViewStub) {
				initDataUpdateReceiver();
				mUsageProgessArc = (ArcProgress) stub.findViewById(R.id.usage_progress);
				mUnlocksText = (TextView) stub.findViewById(R.id.unlocks_text);
				updateUI();
			}
		});
	}

	@Override
	protected void onStart() {
		Log.d(TAG, "onStart");
		super.onStart();
	}

	@Override
	protected void onResume() {
		Log.d(TAG, "onResume");
		super.onResume();
	}

	@Override
	protected void onStop() {
		Log.d(TAG, "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.d(TAG, "onDestroy");
		super.onDestroy();
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
		long unlocks = sharedPreferences.getLong(Globals.UNLOCKS_KEY, 0);
		long usage = sharedPreferences.getLong(Globals.USAGE_KEY, 0);
		long limit = sharedPreferences.getLong(Globals.LIMIT_KEY, 0);
		updateUsage(usage, limit);
		updateUnlocks(unlocks);
	}

	private void updateUnlocks(long unlocks) {
		String unlocksString = String.valueOf(unlocks);
		mUnlocksText.setText("Unlocks: " + unlocksString);
	}

	private void updateUsage(long usage, long limit) {
		mUsageProgessArc.setProgress(getUsagePercentage(usage, limit));
		mUsageProgessArc.setBottomText(getUsageStringFromMillis(usage));
	}

	/**
	 * Return milliseconds converted to hours and minutes.
	 * Returns a String in the format XX Hr XX Min
	 */
	private String getUsageStringFromMillis(long millis) {
		long hours = (millis / 3600000) % 24;
		long minutes = (millis / 60000) % 60;
		return String.format("%d Hr %d Min", hours, minutes);
	}

	/**
	 * Return percentage usage rounded to nearest whole number given usage and limit in millis.
	 */
	private int getUsagePercentage(long usage, long limit) {
		Log.d(TAG, "Usage: " + usage + " Limit: " + limit);
		int percentage =  (int) Math.round(((double) usage / (double) limit) * 100);
		if (percentage < 0 || percentage > 100) {
			Log.e(TAG, "Percentage determined by watch was: " + percentage);
			return 0;
		}
		return percentage;
	}
}

