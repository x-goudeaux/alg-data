/**
 * GreaterThanMaxException represents an exception when SafeNumber is greater than Max.
 * 
 * @author XavierGoudeaux
 *
 */

public class GreaterThanMaxException extends Exception
{
	/**
	 * Constructor, invoke the Exception constructor
	 */
	public GreaterThanMaxException()
	{
		super("SafeNumber is greater than Max. It should be lower than or equal to Max.");
	}

	/**
	 * Constructor, invoke the Exception constructor
	 * 
	 * @param message
	 */
	public GreaterThanMaxException(String message)
	{
		super(message);
	}
}
