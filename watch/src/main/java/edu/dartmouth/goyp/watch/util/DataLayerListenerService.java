package edu.dartmouth.goyp.watch.util;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.WearableListenerService;

import edu.dartmouth.goyp.watch.controllers.MainActivity;

/**
 * Created by SujayBusam on 3/4/16.
 *
 * Service that listens for message from handheld app.
 */
public class DataLayerListenerService extends WearableListenerService {
	private static final String TAG = "SVB-DataLayerLS";
	private static final String UNLOCKS_KEY = "phoneusage.key.unlocks";
	private static final String USAGE_KEY = "phoneusage.key.usage";

	@Override
	public void onDataChanged(DataEventBuffer dataEvents) {
		Log.d(TAG, "onDataChanged");
		SharedPreferences sharedPreferences = PreferenceManager
				.getDefaultSharedPreferences(getApplicationContext());

		for (DataEvent event : dataEvents) {
			if (event.getType() == DataEvent.TYPE_DELETED) {
				Log.d(TAG, "DataItem deleted: " + event.getDataItem().getUri());
			} else if (event.getType() == DataEvent.TYPE_CHANGED) {
				Log.d(TAG, "DataItem changed: " + event.getDataItem().getUri());
				DataItem dataItem = event.getDataItem();
				if (dataItem.getUri().getPath().compareTo("/watchData") == 0) {
					DataMap dataMap = DataMapItem.fromDataItem(dataItem).getDataMap();

					long unlocks = dataMap.getLong(UNLOCKS_KEY);
					long usage = dataMap.getLong(USAGE_KEY);

					// Write to shared prefs and broadcast change.
					sharedPreferences.edit().putLong(UNLOCKS_KEY, unlocks).commit();
					sharedPreferences.edit().putLong(USAGE_KEY, usage).commit();
					broadcastDataChange();
				}
			}
		}
	}

	private void broadcastDataChange() {
		Intent broadcastIntent = new Intent();
		broadcastIntent.setAction(MainActivity.DATA_UPDATE_ACTION);
		sendBroadcast(broadcastIntent);
	}
}
