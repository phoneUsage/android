package edu.dartmouth.phoneusage.models;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * DB helper for the LocalDailyUsageEntry model.
 *
 * Do not interface with this class directly! Use the UnlockLockEventDataSource, which is a nice
 * wrapper around this that provides CRUD operation functions.
 */
public class LocalDailyUsageEntryDbHelper extends SQLiteOpenHelper {
	// Singleton instance
	private static LocalDailyUsageEntryDbHelper mInstance;

	public static final String DATABASE_NAME = "local_daily_usage_entry.db";
	public static final int DATABASE_VERSION = 1;

	public static final String TABLE_NAME = "local_daily_usage_entry";
	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_DATE_TIME_MS = "date_time_ms";
	public static final String COLUMN_TOTAL_UNLOCKS = "total_unlocks";
	public static final String COLUMN_TOTAL_USAGE_MS = "total_usage_ms";
	public static final String COLUMN_GOAL_HOURS_MS = "goal_hours_ms";

	public static final String[] ALL_COLUMNS = {
			COLUMN_ID,
			COLUMN_DATE_TIME_MS,
			COLUMN_TOTAL_UNLOCKS,
			COLUMN_TOTAL_USAGE_MS,
			COLUMN_GOAL_HOURS_MS
	};

	// SQL statement for the initial database creation.
	private static final String DATABASE_CREATE_SQL =
			"CREATE TABLE IF NOT EXISTS " + TABLE_NAME
					+ " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
					+ COLUMN_DATE_TIME_MS + " DATETIME NOT NULL, "
					+ COLUMN_TOTAL_UNLOCKS + " INTEGER NOT NULL, "
					+ COLUMN_TOTAL_USAGE_MS + " INTEGER NOT NULL, "
					+ COLUMN_GOAL_HOURS_MS + " INTEGER NOT NULL "
					+ ");";


	/**
	 * Constructor should be private to prevent direct instantiation.
	 * Make call to static method "getInstance()" instead.
	 */
	private LocalDailyUsageEntryDbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	/**
	 * Public instance getter.
	 */
	public static synchronized LocalDailyUsageEntryDbHelper getInstance(Context context) {
		// Use the application context
		if (mInstance == null) {
			mInstance = new LocalDailyUsageEntryDbHelper(context.getApplicationContext());
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
