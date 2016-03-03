package edu.dartmouth.phoneusage.models.data_sources;

import java.sql.SQLException;

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

	private static String TAG = "UnlockLockDataSource";
	private static UnlockLockEventDataSource instance;

	private UnlockLockEventDbHelper mDbHelper;

	@Override
	public void open() throws SQLException {

	}

	@Override
	public void close() {

	}
}
