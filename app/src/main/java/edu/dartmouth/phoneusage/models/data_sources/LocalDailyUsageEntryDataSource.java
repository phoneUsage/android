package edu.dartmouth.phoneusage.models.data_sources;

import android.content.Context;

import java.sql.SQLException;

import edu.dartmouth.phoneusage.models.sql.LocalDailyUsageEntryDbHelper;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * Use this class to call the public CRUD operation methods!
 *
 * Defines a data source class for LocalDailyUsageEntry objects. This is a singleton class.
 * This interfaces with the ExerciseEntryDbHelper, and is a wrapper around it.
 *
 * There is no need to open and close the database; this class takes care of it.
 */
public class LocalDailyUsageEntryDataSource extends BaseDataSource {

	private static String TAG = "SVB-DailyUsageDataSource";
	private static LocalDailyUsageEntryDataSource instance;

	private LocalDailyUsageEntryDbHelper mDbHelper;

	@Override
	public void open() throws SQLException {
		mDb = mDbHelper.getWritableDatabase();
	}

	@Override
	public void close() {
		mDbHelper.close();
	}

	/**
	 * Constructor is private to enforce singleton property of this class.
	 */
	private LocalDailyUsageEntryDataSource(Context context) {
		this.mDbHelper = LocalDailyUsageEntryDbHelper.getInstance(context);
	}

	/**
	 * Public static instance retriever that enforces singleton property of this class.
	 */
	public static synchronized LocalDailyUsageEntryDataSource getInstance(Context context) {
		if (instance == null) {
			instance = new LocalDailyUsageEntryDataSource(context.getApplicationContext());
		}
		return instance;
	}


	// **************************** Public CRUD operation methods ********************************//


	// ********************************** Private Async Tasks ************************************//
}
