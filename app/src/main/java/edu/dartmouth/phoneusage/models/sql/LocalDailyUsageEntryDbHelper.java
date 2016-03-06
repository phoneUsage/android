package edu.dartmouth.phoneusage.models.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.Calendar;

import edu.dartmouth.phoneusage.models.classes.LocalDailyUsageEntry;
import edu.dartmouth.phoneusage.utils.CalendarUtil;

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

	private static final String TAG = "SVB-DailyUsageDbHelper";
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
		// Execute SQL command on this new database to create our LocalDailyUsageEntry table,
		// and add some test data.
		db.execSQL(DATABASE_CREATE_SQL);
		populateTestData(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// Nothing yet
	}

	// **************************** Private helper functions *************************************//

	private void populateTestData(SQLiteDatabase db) {
		// Create a couple entries for the week of Feb 21st

		Calendar sunday21 = CalendarUtil.calendarForDateStart(Calendar.FEBRUARY, 21, 2016);
		LocalDailyUsageEntry sunday21Entry = new LocalDailyUsageEntry();
		sunday21Entry.setDateTimeMS(sunday21.getTimeInMillis());
		sunday21Entry.setTotalUnlocks(100);
		sunday21Entry.setTotalUsageInHours(2.21f);
		sunday21Entry.setGoalHoursInHours(1.88f);

		Calendar saturday27 = CalendarUtil.calendarForDateStart(Calendar.FEBRUARY, 27, 2016);
		LocalDailyUsageEntry saturday27Entry = new LocalDailyUsageEntry();
		saturday27Entry.setDateTimeMS(saturday27.getTimeInMillis());
		saturday27Entry.setTotalUnlocks(144);
		saturday27Entry.setTotalUsageInHours(5.50f);
		saturday27Entry.setGoalHoursInHours(2.35f);


		// Create entries for Sun - Thurs of the week of Feb 28th

		Calendar sunday28 = CalendarUtil.calendarForDateEnd(Calendar.FEBRUARY, 28, 2016);
		LocalDailyUsageEntry sunday28Entry = new LocalDailyUsageEntry();
		sunday28Entry.setDateTimeMS(sunday28.getTimeInMillis());
		sunday28Entry.setTotalUnlocks(233);
		sunday28Entry.setTotalUsageInHours(5.65f);
		sunday28Entry.setGoalHoursInHours(3.44f);

		Calendar monday29 = CalendarUtil.calendarForDateEnd(Calendar.FEBRUARY, 29, 2016);
		LocalDailyUsageEntry monday29Entry = new LocalDailyUsageEntry();
		monday29Entry.setDateTimeMS(monday29.getTimeInMillis());
		monday29Entry.setTotalUnlocks(124);
		monday29Entry.setTotalUsageInHours(3.55f);
		monday29Entry.setGoalHoursInHours(4.21f);

		Calendar tuesday1 = CalendarUtil.calendarForDateEnd(Calendar.MARCH, 1, 2016);
		LocalDailyUsageEntry tuesday1Entry = new LocalDailyUsageEntry();
		tuesday1Entry.setDateTimeMS(tuesday1.getTimeInMillis());
		tuesday1Entry.setTotalUnlocks(222);
		tuesday1Entry.setTotalUsageInHours(3.18f);
		tuesday1Entry.setGoalHoursInHours(4.90f);

		Calendar wednesday2 = CalendarUtil.calendarForDateEnd(Calendar.MARCH, 2, 2016);
		LocalDailyUsageEntry wednesday2Entry = new LocalDailyUsageEntry();
		wednesday2Entry.setDateTimeMS(wednesday2.getTimeInMillis());
		wednesday2Entry.setTotalUnlocks(88);
		wednesday2Entry.setTotalUsageInHours(8.32f);
		wednesday2Entry.setGoalHoursInHours(7.45f);

		Calendar thursday3 = CalendarUtil.calendarForDateEnd(Calendar.MARCH, 3, 2016);
		LocalDailyUsageEntry thursday3Entry = new LocalDailyUsageEntry();
		thursday3Entry.setDateTimeMS(thursday3.getTimeInMillis());
		thursday3Entry.setTotalUnlocks(124);
		thursday3Entry.setTotalUsageInHours(8.00f);
		thursday3Entry.setGoalHoursInHours(6.77f);

		insert(db, sunday21Entry);
		insert(db, saturday27Entry);
		insert(db, sunday28Entry);
		insert(db, monday29Entry);
		insert(db, tuesday1Entry);
		insert(db, wednesday2Entry);
		insert(db, thursday3Entry);
	}

	private void insert(SQLiteDatabase db, LocalDailyUsageEntry entry) {
		// Populate the ContentValues
		ContentValues values = new ContentValues();
		values.put(LocalDailyUsageEntryDbHelper.COLUMN_DATE_TIME_MS, entry.getDateTimeMS());
		values.put(LocalDailyUsageEntryDbHelper.COLUMN_TOTAL_UNLOCKS, entry.getTotalUnlocks());
		values.put(LocalDailyUsageEntryDbHelper.COLUMN_TOTAL_USAGE_MS, entry.getTotalUsageMS());
		values.put(LocalDailyUsageEntryDbHelper.COLUMN_GOAL_HOURS_MS, entry.getGoalHoursMS());

		// Insert into db and get ID
		long insertId = db.insert(LocalDailyUsageEntryDbHelper.TABLE_NAME, null, values);
		Log.d(TAG, "Inserted LocalDailyUsageEntry into db. Id: " + insertId + " MS: " + entry.getDateTimeMS());
	}
}
