package edu.dartmouth.phoneusage.models.data_sources;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.dartmouth.phoneusage.models.classes.LocalDailyUsageEntry;
import edu.dartmouth.phoneusage.models.classes.UnlockLockEvent;
import edu.dartmouth.phoneusage.models.sql.LocalDailyUsageEntryDbHelper;
import edu.dartmouth.phoneusage.models.sql.UnlockLockEventDbHelper;

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

	/**
	 * Asynchronously save a LocalDailyUsageEntry to the local database. The completion handler will
	 * be called with the saved LocalDailyUsageEntry.
	 */
	public void saveLocalDailyUsageEntry(LocalDailyUsageEntry entry,
										 CompletionHandler<LocalDailyUsageEntry> completionHandler) {
		SaveEntryTask task = new SaveEntryTask(completionHandler);
		task.execute(entry);
	}

	/**
	 * Asynchronously fetch all LocalDailyUsageEntries between the two given date times in
	 * milliseconds, inclusive. The completion handler will be called with the List of fetched
	 * LocalDailyUsageEntries.
	 */
	public void fetchLocalDailyUsageEntriesBetweenDateTimes(
			long startDateTimeMS, long endDateTimeMS,
			CompletionHandler<List<LocalDailyUsageEntry>> completionHandler) {
		FetchEntryTask task = new FetchEntryTask(startDateTimeMS, endDateTimeMS, completionHandler);
		task.execute();
	}

	// ********************************** Private Async Tasks ************************************//

	/**
	 * Task to save a LocalDailyUsageEntry in the database asynchronously.
	 */
	private class SaveEntryTask extends BaseEntryAsyncTask<LocalDailyUsageEntry, LocalDailyUsageEntry> {

		public SaveEntryTask(CompletionHandler<LocalDailyUsageEntry> completionHandler) {
			super(completionHandler);
		}

		@Override
		protected LocalDailyUsageEntry doInBackground(LocalDailyUsageEntry... params) {
			LocalDailyUsageEntry entry = params[0]; // Only one being saved

			try {
				// Populate the ContentValues
				ContentValues values = new ContentValues();
				values.put(LocalDailyUsageEntryDbHelper.COLUMN_DATE_TIME_MS, entry.getDateTimeMS());
				values.put(LocalDailyUsageEntryDbHelper.COLUMN_TOTAL_UNLOCKS, entry.getTotalUnlocks());
				values.put(LocalDailyUsageEntryDbHelper.COLUMN_TOTAL_USAGE_MS, entry.getTotalUsageMS());
				values.put(LocalDailyUsageEntryDbHelper.COLUMN_GOAL_HOURS_MS, entry.getGoalHoursMS());

				// Insert into db and get ID
				open();
				long insertId = mDb.insert(LocalDailyUsageEntryDbHelper.TABLE_NAME, null, values);
				Log.d(TAG, "Inserted LocalDailyUsageEntry into db. Id: " + entry.getId());

				// Get the newly saved LocalDailyUsageEntry and return it.
				Cursor cursor = mDb.query(LocalDailyUsageEntryDbHelper.TABLE_NAME,
						LocalDailyUsageEntryDbHelper.ALL_COLUMNS,
						LocalDailyUsageEntryDbHelper.COLUMN_ID + " = " + insertId,
						null, null, null, null);
				cursor.moveToFirst();
				LocalDailyUsageEntry newEntry = cursorToLocalDailyUsageEntry(cursor);
				cursor.close();

				Log.d(TAG, "Saved and retrieved LocalDailyUsageEntry: " + newEntry);
				return newEntry;
			} catch (SQLException e) {
				e.printStackTrace();
				Log.d(TAG, "Failed to insert LocalDailyUsageEntry with id: " + entry.getId());
				return null;
			}
		}
	}

	/**
	 * Task to fetch all LocalDailyUsageEntries between the given datetime (milliseconds) asynchronously.
	 */
	private class FetchEntryTask extends BaseEntryAsyncTask<Void, List<LocalDailyUsageEntry>> {
		long mStartDateTimeMS;
		long mEndDateTimeMS;

		public FetchEntryTask(long startDateTimeMS, long endDateTimeMS,
							  CompletionHandler<List<LocalDailyUsageEntry>> completionHandler) {
			super(completionHandler);
			this.mStartDateTimeMS = startDateTimeMS;
			this.mEndDateTimeMS = endDateTimeMS;
		}

		@Override
		protected List<LocalDailyUsageEntry> doInBackground(Void... params) {
			List<LocalDailyUsageEntry> queriedEntries = new ArrayList<>();

			// Query the database for LocalDailyUsageEntries between the start and end datetime milliseconds.
			try {
				open();
				Cursor cursor = mDb.query(LocalDailyUsageEntryDbHelper.TABLE_NAME,
						LocalDailyUsageEntryDbHelper.ALL_COLUMNS,
						LocalDailyUsageEntryDbHelper.COLUMN_DATE_TIME_MS + " BETWEEN ? AND ?",
						new String[] {String.valueOf(mStartDateTimeMS), String.valueOf(mEndDateTimeMS)},
						null, null, null, null);
				cursor.moveToFirst();
				while (!cursor.isAfterLast()) {
					queriedEntries.add(cursorToLocalDailyUsageEntry(cursor));
					cursor.moveToNext();
				}
				cursor.close();
				return queriedEntries;
			} catch (SQLException e) {
				e.printStackTrace();
				Log.d(TAG, String.format("Failed to fetch LocalDailyUsageEntries between dates %d and %d",
						mStartDateTimeMS, mEndDateTimeMS));
				return null;
			}
		}
	}

	// **************************** Private helper functions *************************************//
	/**
	 * Create and return a LocalDailyUsageEntry object from the given Cursor.
	 */
	private LocalDailyUsageEntry cursorToLocalDailyUsageEntry(Cursor cursor) {
		if (cursor.getCount() != LocalDailyUsageEntryDbHelper.ALL_COLUMNS.length) {
			Log.e(TAG, "Invalid cursor passed in");
			return null;
		}

		return new LocalDailyUsageEntry(
				cursor.getLong(0), cursor.getLong(1), cursor.getInt(2), cursor.getLong(3),
				cursor.getLong(4)
		);
	}

}
