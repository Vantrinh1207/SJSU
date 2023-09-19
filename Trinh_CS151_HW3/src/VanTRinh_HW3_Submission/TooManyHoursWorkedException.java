
public class TooManyHoursWorkedException extends Exception {

	/**
	 * exception.
	 * 
	 * @param e The message
	 */
	TooManyHoursWorkedException(String e) {
		super(e);
	}

	@Override
	/**
	 * Gets the message passed to our custom exception
	 */
	public String getMessage() {
		return super.getMessage();
	}

}