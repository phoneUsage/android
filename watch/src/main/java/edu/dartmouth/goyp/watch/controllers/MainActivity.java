package edu.dartmouth.goyp.watch.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.Wearable;

import java.util.concurrent.TimeUnit;

import edu.dartmouth.goyp.watch.R;

public class MainActivity extends Activity implements
		DataApi.DataListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

	private static final String TAG = "SVB-WatchMain";
	private static final String UNLOCKS_KEY = "phoneusage.key.unlocks";
	private static final String USAGE_KEY = "phoneusage.key.usage";

	private GoogleApiClient mGoogleApiClient;
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
			}
		});

		mGoogleApiClient = new GoogleApiClient.Builder(this)
				.addApi(Wearable.API)
				.addConnectionCallbacks(this)
				.addOnConnectionFailedListener(this)
				.build();
	}

	@Override
	protected void onStart() {
		super.onStart();
		mGoogleApiClient.connect();
	}

	@Override
	public void onConnected(Bundle connectionHint) {
		if (Log.isLoggable(TAG, Log.DEBUG)) {
			Log.d(TAG, "Connected to Google Api Service");
		}
		Wearable.DataApi.addListener(mGoogleApiClient, this);
	}

	@Override
	public void onConnectionSuspended(int i) {
		Log.d(TAG, "onConnectionSuspended");
	}

	@Override
	public void onConnectionFailed(ConnectionResult connectionResult) {
		Log.d(TAG, "onConnectionFailed. Result: " + connectionResult);
	}

	@Override
	protected void onStop() {
		if (null != mGoogleApiClient && mGoogleApiClient.isConnected()) {
			Wearable.DataApi.removeListener(mGoogleApiClient, this);
			mGoogleApiClient.disconnect();
		}
		super.onStop();
	}

	@Override
	public void onDataChanged(DataEventBuffer dataEvents) {
		for (DataEvent event : dataEvents) {
			if (event.getType() == DataEvent.TYPE_DELETED) {
				Log.d(TAG, "DataItem deleted: " + event.getDataItem().getUri());
			} else if (event.getType() == DataEvent.TYPE_CHANGED) {
				Log.d(TAG, "DataItem changed: " + event.getDataItem().getUri());
				DataItem dataItem = event.getDataItem();
				if (dataItem.getUri().getPath().compareTo("/watchData") == 0) {
					DataMap dataMap = DataMapItem.fromDataItem(dataItem).getDataMap();
//					Toast.makeText(this, "Unlocks: " + dataMap.getLong(UNLOCKS_KEY) + " Usage: " +
//							dataMap.getLong(USAGE_KEY), Toast.LENGTH_SHORT).show();

					long unlocks = dataMap.getLong(UNLOCKS_KEY);
					long usage = dataMap.getLong(USAGE_KEY);
					updateUnlocks(unlocks);
					updateUsage(usage);
				}
			}
		}
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
	public float getHoursFromMillis(long millis) {
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
		float hours = minutes / 60.0f;
		return Math.round(hours * 100.0f) / 100.0f;
	}
}

