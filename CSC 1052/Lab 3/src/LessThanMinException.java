/**
 * LessThanMinException represents an exception when SafeNumber is less than Min.
 * 
 * @author XavierGoudeaux
 *
 */

public class LessThanMinException extends Exception
{
	/**
	 * Constructor, invoke the Exception constructor
	 */
	public LessThanMinException()
	{
		super("SafeNumber is less than Min. It should be greater than or equal to Min");
	}

	/**
	 * Constructor, invoke the Exception constructor
	 * 
	 * @param message
	 */
	public LessThanMinException(String message)
	{
		super(message); 
	}
}
