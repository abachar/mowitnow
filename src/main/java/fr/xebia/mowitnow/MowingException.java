package fr.xebia.mowitnow;

/**
 * This exception will be thrown when the input instruction are invalids
 *
 * @author abachar
 */
public class MowingException extends Exception {

	/**
	 * @see Exception#Exception()
	 */
	public MowingException() {
		super();
	}

	/**
	 * @see Exception#Exception(String)
	 */
	public MowingException(String message) {
		super(message);
	}

	/**
	 * @see Exception#Exception(String, Throwable)
	 */
	public MowingException(String message, Throwable cause) {
		super(message, cause);
	}
}
