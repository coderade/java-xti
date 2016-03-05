package threads;

public class ClientsBuying implements Runnable
{
	JointAccount accounts = new JointAccount();
	
	public static void main(String[] args) 
	{
		ClientsBuying familyBuying = new ClientsBuying();
		
		new Thread(familyBuying, "Father").start();
		new Thread(familyBuying, "Mother").start();
		new Thread(familyBuying, "Son").start();
		new Thread(familyBuying, "Daughter").start();
	}
	
	@Override
	public void run()
	{
		String client = Thread.currentThread().getName();
		
		for (int i=0; i<5; i++)
		{
			accounts.Withdraw(20, client);
			
			if (accounts.getBalance()<0)
			{
				System.out.println("You don't have more balance!");
			}
		}
		
	}
	
}
