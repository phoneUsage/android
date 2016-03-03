package edu.dartmouth.phoneusage.models.data_sources;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import java.sql.SQLException;

import edu.dartmouth.phoneusage.models.classes.UnlockLockEvent;
import edu.dartmouth.phoneusage.models.sql.UnlockLockEventDbHelper;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * Use this class to call the public CRUD operation methods!
 *
 * Defines a data source class for UnlockLockEvent objects. This is a singleton class.
 * This interfaces with the ExerciseEntryDbHelper, and is a wrapper around it.
 *
 * There is no need to open and close the database; this class takes care of it.
 */
public class UnlockLockEventDataSource extends BaseDataSource {

	private static String TAG = "SVB-UnlockLockDataSource";
	private static UnlockLockEventDataSource instance;

	private UnlockLockEventDbHelper mDbHelper;

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
	private UnlockLockEventDataSource(Context context) {
		this.mDbHelper = UnlockLockEventDbHelper.getInstance(context);
	}

	/**
	 * Public static instance retriever that enforces singleton property of this class.
	 */
	public static synchronized UnlockLockEventDataSource getInstance(Context context) {
		if (instance == null) {
			instance = new UnlockLockEventDataSource(context.getApplicationContext());
		}
		return instance;
	}


	// **************************** Public CRUD operation methods ********************************//

	/**
	 * Asynchronously save an UnlockLockEvent to the local database. The completion handler will be
	 * called with the saved UnlockLockEvent.
	 */
	public void saveUnlockLockEvent(UnlockLockEvent event,
									CompletionHandler<UnlockLockEvent> completionHandler) {
		SaveEntryTask task = new SaveEntryTask(completionHandler);
		task.execute(event);
	}

	// ********************************** Private Async Tasks ************************************//

	/**
	 * Task to save an UnlockLockEvent in the database.
	 */
	private class SaveEntryTask extends BaseEntryAsyncTask<UnlockLockEvent, UnlockLockEvent> {

		public SaveEntryTask(CompletionHandler<UnlockLockEvent> completionHandler) {
			super(completionHandler);
		}

		@Override
		protected UnlockLockEvent doInBackground(UnlockLockEvent... params) {
			UnlockLockEvent unlockLockEvent = params[0]; // Only one being saved

			try {
				// Populate the ContentValues
				ContentValues values = new ContentValues();
				values.put(UnlockLockEventDbHelper.COLUMN_UNLOCK_TIME_MS, unlockLockEvent.getUnlockTimeMS());
				values.put(UnlockLockEventDbHelper.COLUMN_LOCK_TIME_MS, unlockLockEvent.getLockTimeMS());

				// Insert into db and get ID
				open();
				long insertId = mDb.insert(UnlockLockEventDbHelper.TABLE_NAME, null, values);
				Log.d(TAG, "Inserted UnlockLockEvent into db. Id: " + unlockLockEvent.getId());

				// Get the newly saved UnlockLockEvent and return it.
				Cursor cursor = mDb.query(UnlockLockEventDbHelper.TABLE_NAME,
						UnlockLockEventDbHelper.ALL_COLUMNS,
						UnlockLockEventDbHelper.COLUMN_ID + " = " + insertId,
						null, null, null, null);
				cursor.moveToFirst();
				UnlockLockEvent newUnlockLockEvent = cursorToUnlockLockEvent(cursor);
				cursor.close();
				return newUnlockLockEvent;
			} catch (SQLException e) {
				Log.d(TAG, "Failed to insert UnlockLockEvent with id: " + unlockLockEvent.getId());
				return null;
			}
		}
	}

	// **************************** Private helper functions *************************************//

	/**
	 * Create and return an UnlockLockEvent object from the given Cursor.
	 */
	private UnlockLockEvent cursorToUnlockLockEvent(Cursor cursor) {
		return new UnlockLockEvent(
			cursor.getLong(0), cursor.getLong(1), cursor.getLong(2)
		);
	}

}
