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

	/**
	 * Default constructor with no fields given.
	 * If you use this, you have to make sure all fields are set properly before saving to db!
	 */
	public UnlockLockEvent() {
		this.unlockTimeMS = -1;
		this.lockTimeMS = -1;
	}

	/**
	 * Constructor with all fields provided.
	 */
	public UnlockLockEvent(long id, long unlockTimeMS, long lockTimeMS) {
		this.id = id;
		this.unlockTimeMS = unlockTimeMS;
		this.lockTimeMS = lockTimeMS;
	}

	@Override
	public String toString() {
		return String.format("{ ID: %d, unlockTimeMS: %d, lockTimeMS: %d }",
				getId(), getUnlockTimeMS(), getLockTimeMS());
	}

	// ********************************** Public Setters ***************************************//

	public void setUnlockTimeMS(long unlockTimeMS) {
		this.unlockTimeMS = unlockTimeMS;
	}

	public void setLockTimeMS(long lockTimeMS) {
		this.lockTimeMS = lockTimeMS;
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

	// ****************************** Useful Instance Methods ************************************//

}
