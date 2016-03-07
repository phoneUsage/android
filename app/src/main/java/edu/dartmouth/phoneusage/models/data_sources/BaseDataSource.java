package edu.dartmouth.phoneusage.models.data_sources;

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

import java.sql.SQLException;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * Abstract base async database task that is implemented by various DataSource classes.
 * Provides common instance variables and methods for all DataSource classes.
 *
 * Also provides the CompletionHandler interface and BaseEntryAsyncTask abstract class.
 */
public abstract class BaseDataSource {

	protected SQLiteDatabase mDb;

	public abstract void open() throws SQLException;
	public abstract void close();

	// ************************* CRUD async task base interfaces *********************************//

	/**
	 * Provides a way to execute a callback after something is written to / read from the database,
	 * using the abstract result.
	 */
	public interface CompletionHandler<T> {
		void onTaskCompleted(T result);
	}

	/**
	 * Abstract base async task that is implemented by various CRUD method tasks.
	 */
	abstract public class BaseEntryAsyncTask<S, T> extends AsyncTask<S, Void, T> {

		private final CompletionHandler<T> completionHandler;

		public BaseEntryAsyncTask(CompletionHandler<T> completionHandler) {
			this.completionHandler = completionHandler;
		}

		@Override
		protected void onPostExecute(T result) {
			super.onPostExecute(result);

			if (this.completionHandler != null) {
				this.completionHandler.onTaskCompleted(result);
			}
		}
	}


}
