package edu.dartmouth.phoneusage.models.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SujayBusam on 3/1/16.
 *
 * DB helper for the UnlockLockEvent model.
 *
 * Do not interface with this class directly! Use the UnlockLockEventDataSource, which is a nice
 * wrapper around this that provides CRUD operation functions.
 */
public class UnlockLockEventDbHelper extends SQLiteOpenHelper {
	// Singleton instance
	private static UnlockLockEventDbHelper mInstance;

	public static final String DATABASE_NAME = "unlock_lock_event.db";
	public static final int DATABASE_VERSION = 1;

	public static final String TABLE_NAME = "unlock_lock_event";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_UNLOCK_TIME_MS = "unlock_time_ms";
	public static final String COLUMN_LOCK_TIME_MS = "lock_time_ms";

	public static final String[] ALL_COLUMNS = {
			COLUMN_ID,
			COLUMN_UNLOCK_TIME_MS,
			COLUMN_LOCK_TIME_MS
	};

	// SQL statement for the initial database creation.
	private static final String DATABASE_CREATE_SQL =
			"CREATE TABLE IF NOT EXISTS " + TABLE_NAME
					+ " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ COLUMN_UNLOCK_TIME_MS + " DATETIME NOT NULL, "
					+ COLUMN_LOCK_TIME_MS + " DATETIME NOT NULL "
					+ ");";


	/**
	 * Constructor should be private to prevent direct instantiation.
	 * Make call to static method "getInstance()" instead.
	 */
	private UnlockLockEventDbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	/**
	 * Public instance getter.
	 */
	public static synchronized UnlockLockEventDbHelper getInstance(Context context) {
		// Use the application context
		if (mInstance == null) {
			mInstance = new UnlockLockEventDbHelper(context.getApplicationContext());
		}
		return mInstance;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// Execute SQL command on this new database to create our UnlockLockEvent table.
		db.execSQL(DATABASE_CREATE_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Nothing yet
	}
}
