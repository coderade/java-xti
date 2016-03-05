package Exception;

public class TestPass 
{
	static void authenticated (String pass) throws WrongPasswordException
	{
		if ("123".equals(pass)) 
		{
			System.out.println("You are authenticated!");
		}
		else
		{
			throw new WrongPasswordException("Wrong password!");
			
		}
	}
	public static void main(String[] args) {
		try 
		{
				authenticated("124");
		} 
		catch (WrongPasswordException w) 
		{
			w.printStackTrace();
			System.out.println(w.getMessage());
		}
	}
}
