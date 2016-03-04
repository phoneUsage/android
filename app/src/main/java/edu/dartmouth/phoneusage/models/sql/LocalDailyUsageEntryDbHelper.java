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
		// Create entries for Sun - Thurs of the week of Feb 28th

		Calendar sunday = CalendarUtil.calendarForDateEnd(Calendar.FEBRUARY, 28, 2016);
		LocalDailyUsageEntry sundayEntry = new LocalDailyUsageEntry();
		sundayEntry.setDateTimeMS(sunday.getTimeInMillis());
		sundayEntry.setTotalUnlocks(233);
		sundayEntry.setTotalUsageInHours(5.65f);
		sundayEntry.setGoalHoursInHours(3.44f);

		Calendar monday = CalendarUtil.calendarForDateEnd(Calendar.FEBRUARY, 29, 2016);
		LocalDailyUsageEntry mondayEntry = new LocalDailyUsageEntry();
		mondayEntry.setDateTimeMS(monday.getTimeInMillis());
		mondayEntry.setTotalUnlocks(124);
		mondayEntry.setTotalUsageInHours(3.55f);
		mondayEntry.setGoalHoursInHours(5.55f);

		Calendar tuesday = CalendarUtil.calendarForDateEnd(Calendar.MARCH, 1, 2016);
		LocalDailyUsageEntry tuesdayEntry = new LocalDailyUsageEntry();
		tuesdayEntry.setDateTimeMS(tuesday.getTimeInMillis());
		tuesdayEntry.setTotalUnlocks(222);
		tuesdayEntry.setTotalUsageInHours(4.55f);
		tuesdayEntry.setGoalHoursInHours(5.55f);

		Calendar wednesday = CalendarUtil.calendarForDateEnd(Calendar.MARCH, 2, 2016);
		LocalDailyUsageEntry wednesdayEntry = new LocalDailyUsageEntry();
		wednesdayEntry.setDateTimeMS(wednesday.getTimeInMillis());
		wednesdayEntry.setTotalUnlocks(88);
		wednesdayEntry.setTotalUsageInHours(5.55f);
		wednesdayEntry.setGoalHoursInHours(5.55f);

		Calendar thursday = CalendarUtil.calendarForDateEnd(Calendar.MARCH, 3, 2016);
		LocalDailyUsageEntry thursdayEntry = new LocalDailyUsageEntry();
		thursdayEntry.setDateTimeMS(thursday.getTimeInMillis());
		thursdayEntry.setTotalUnlocks(124);
		thursdayEntry.setTotalUsageInHours(3.55f);
		thursdayEntry.setGoalHoursInHours(5.55f);

		insert(db, sundayEntry);
		insert(db, mondayEntry);
		insert(db, tuesdayEntry);
		insert(db, wednesdayEntry);
		insert(db, thursdayEntry);
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
