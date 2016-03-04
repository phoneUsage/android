package edu.dartmouth.phoneusage.models.classes;

import java.util.concurrent.TimeUnit;

/**
 * Created by SujayBusam on 3/3/16.
 *
 * Class that encapsulates all of the daily usage for the local user. Persisted in local db.
 * These entries from the local db will also get pushed to Parse by the midnight scheduler.
 */
public class LocalDailyUsageEntry {

	private Long id; // Not set explicitly. This is an auto-incremented field in the db

	private int totalUnlocks;
	private long totalUsageMS; // in milliseconds
	private long dateTimeMS; // the date for the entry in milliseconds
	private long goalHoursMS; // today's goal hours in milliseconds for the local user

	/**
	 * Constructor with all fields provided.
	 */
	public LocalDailyUsageEntry(int totalUnlocks, long totalUsageMS, long dateTimeMS, long goalHoursMS) {
		this.totalUnlocks = totalUnlocks;
		this.totalUsageMS = totalUsageMS;
		this.dateTimeMS = dateTimeMS;
		this.goalHoursMS = goalHoursMS;
	}

	// ********************************** Public Setters ***************************************//

	public void setTotalUnlocks(int totalUnlocks) {
		this.totalUnlocks = totalUnlocks;
	}

	public void setTotalUsageMS(long totalUsageMS) {
		this.totalUsageMS = totalUsageMS;
	}

	public void setDateTimeMS(long dateTimeMS) {
		this.dateTimeMS = dateTimeMS;
	}

	public void setGoalHoursMS(long goalHoursMS) {
		this.goalHoursMS = goalHoursMS;
	}

	// ********************************** Public Getters ***************************************//


	public Long getId() {
		return id;
	}

	public int getTotalUnlocks() {
		return totalUnlocks;
	}

	public long getTotalUsageMS() {
		return totalUsageMS;
	}

	public long getDateTimeMS() {
		return dateTimeMS;
	}

	public long getGoalHoursMS() {
		return goalHoursMS;
	}

	// ****************************** Useful Instance Methods ************************************//

	/**
	 * Return the total daily usage in hours rounded to two decimal places.
	 */
	public double getTotalUsageHours() {
		long minutes = TimeUnit.MILLISECONDS.toMinutes(getTotalUsageMS());
		double hours = minutes / 60.0;
		return Math.round(hours * 100.0) / 100.0;
	}
}
