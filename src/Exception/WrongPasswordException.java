package Exception;

public class WrongPasswordException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8893903610713515805L;

	public WrongPasswordException(String message) 
	{
		super (message);
	}
}
