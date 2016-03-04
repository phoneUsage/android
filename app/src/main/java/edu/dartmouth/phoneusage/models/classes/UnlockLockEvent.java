package edu.dartmouth.phoneusage.models.classes;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * Class that represents an unlock and lock event. Persisted in local db.
 */
public class UnlockLockEvent {

	private long id; // Not set explicitly by consumer of this class. This is an auto-incremented field in the db

	private long unlockTimeMS; // Unlock (start) datetime in milliseconds
	private long lockTimeMS; // Lock (end) datetime in milliseconds
	private long dateTimeMS; // The date for the event in milliseconds

	/**
	 * Constructor with all fields provided.
	 */
	public UnlockLockEvent(long id, long unlockTimeMS, long lockTimeMS, long dateTimeMS) {
		this.id = id;
		this.unlockTimeMS = unlockTimeMS;
		this.lockTimeMS = lockTimeMS;
		this.dateTimeMS = dateTimeMS;
	}

	@Override
	public String toString() {
		return String.format("[ ID: %d, dateTimeMS: %d, unlockTimeMS: %d, lockTimeMS: %d ]",
				getId(), getDateTimeMS(), getUnlockTimeMS(), getLockTimeMS());
	}

	// ********************************** Public Setters ***************************************//

	public void setUnlockTimeMS(long unlockTimeMS) {
		this.unlockTimeMS = unlockTimeMS;
	}

	public void setLockTimeMS(long lockTimeMS) {
		this.lockTimeMS = lockTimeMS;
	}

	public void setDateTimeMS(long dateTimeMS) {
		this.dateTimeMS = dateTimeMS;
	}

	// ********************************** Public Getters ***************************************//

	public long getId() {
		return id;
	}

	public long getUnlockTimeMS() {
		return unlockTimeMS;
	}

	public long getLockTimeMS() {
		return lockTimeMS;
	}

	public long getDateTimeMS() {
		return dateTimeMS;
	}

	// ****************************** Useful Instance Methods ************************************//

}
