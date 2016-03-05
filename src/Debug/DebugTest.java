package Debug;

public class DebugTest 
{
	int result;
	public int root(int number)
	{
	 int root=0, even =1;
	 while(number >=even)
	 {
		number -= even;
		even+=2;
		++root;
	 }
	return root;
	}
	public static void main(String[] args) 
	{
		int number =25;
		DebugTest test = new DebugTest();
		int root = test.root(number);
		
		if (root == 5)
		{
			System.out.println("Correct square root!");
		}
		else
		{
			System.out.println("Wrong square root!");
		}
	}
	
}
