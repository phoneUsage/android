package edu.dartmouth.phoneusage.utils;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;

/**
 * Created by SujayBusam on 3/4/16.
 *
 * Utility functions to interface with watch app.
 */
public class WatchUtil {
	private static final String UNLOCKS_KEY = "phoneusage.key.unlocks";
	private static final String USAGE_KEY = "phoneusage.key.usage";

	/**
	 * Create a data map and put the given unlocks and usage in it.
	 *
	 * The watch app listens for updates to this.
	 */
	public static void createDataMap(GoogleApiClient apiClient, long unlocks, long usageMS) {
		PutDataMapRequest putDataMapReq = PutDataMapRequest.create("/watchData");
		putDataMapReq.getDataMap().putLong(UNLOCKS_KEY, unlocks);
		putDataMapReq.getDataMap().putLong(USAGE_KEY, usageMS);
		PutDataRequest putDataReq = putDataMapReq.asPutDataRequest();
		putDataReq.setUrgent();
		PendingResult<DataApi.DataItemResult> pendingResult =
				Wearable.DataApi.putDataItem(apiClient, putDataReq);
	}

}
