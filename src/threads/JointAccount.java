package threads;

public class JointAccount {

	public int balance = 200;
	
	public int getBalance()
	{
		return balance;
	}
	
	public synchronized void Withdraw(int value, String client)
	{
		if (balance >= value)
		{			
			int originalBalance = balance;
			System.out.println("The client " + client + " is ready for withdraw!");
			try 
			{
				System.out.println("The system is processing the service");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {}
			balance -= value;
			String msg ="The client " + client + " withdraw US$ " + value +
						". The previous balance was "+ originalBalance + " and the current balance is: " + balance;
			System.out.println(msg);
			
		}
		else
		{
			System.out.println("The client " + client + " can't do the withdraw. The balance is insufficient!");
		}
	}

}
