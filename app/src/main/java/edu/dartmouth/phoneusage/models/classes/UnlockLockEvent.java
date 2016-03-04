package edu.dartmouth.phoneusage.models.classes;

/**
 * Created by SujayBusam on 3/2/16.
 *
 * Class that represents an unlock and lock event. Persisted in local db.
 */
public class UnlockLockEvent {

	private Long id; // Not set explicitly. This is an auto-incremented field in the db

	private Long unlockTimeMS; // Unlock (start) datetime in milliseconds
	private Long lockTimeMS; // Lock (end) datetime in milliseconds

	/**
	 * Constructor with all fields provided.
	 */
	public UnlockLockEvent(Long id, Long unlockTimeMS, Long lockTimeMS) {
		this.id = id;
		this.unlockTimeMS = unlockTimeMS;
		this.lockTimeMS = lockTimeMS;
	}

	// ********************************** Public Setters ***************************************//

	public void setUnlockTimeMS(Long unlockTimeMS) {
		this.unlockTimeMS = unlockTimeMS;
	}

	public void setLockTimeMS(Long lockTimeMS) {
		this.lockTimeMS = lockTimeMS;
	}

	// ********************************** Public Getters ***************************************//

	public Long getId() {
		return id;
	}

	public Long getUnlockTimeMS() {
		return unlockTimeMS;
	}

	public Long getLockTimeMS() {
		return lockTimeMS;
	}

	// ****************************** Useful Instance Methods ************************************//

}
