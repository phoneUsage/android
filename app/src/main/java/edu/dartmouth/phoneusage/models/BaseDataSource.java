package edu.dartmouth.phoneusage.models;

import android.os.AsyncTask;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * Abstract base async database task that can be implemented by various DataSource classes.
 * Provides common instance variables and methods for all DataSource classes.
 *
 * Also provides the CompletionHandler interface and BaseEntryAsyncTask abstract class.
 */
public abstract class BaseDataSource {


	// ************************* CRUD async task base interfaces *********************************//

	/**
	 * Provides a way to execute a callback after something is written to / read from the database,
	 * using the abstract result.
	 */
	public interface CompletionHandler<T> {
		void onDbTaskCompleted(T result);
	}

	/**
	 * Abstract base async task that can be implemented by various CRUD method tasks.
	 */
	abstract private class BaseEntryAsyncTask<S, T> extends AsyncTask<S, Void, T> {

		private final CompletionHandler<T> completionHandler;

		public BaseEntryAsyncTask(CompletionHandler<T> completionHandler) {
			this.completionHandler = completionHandler;
		}

		@Override
		protected void onPostExecute(T result) {
			super.onPostExecute(result);

			if (this.completionHandler != null) {
				this.completionHandler.onDbTaskCompleted(result);
			}
		}
	}


}
