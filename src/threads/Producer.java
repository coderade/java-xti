package threads;
import java.util.Random;

public class Producer implements Runnable
{
	private Bridge bridge;
	
	public Producer(Bridge bridge) 
	{
		this.bridge = bridge;
	}
	
	private Random random = new Random();
	
	@Override
	public void run() 
	{
		int total = 0;
		for (int i = 0; i < 5; i++) 
		{
			
			try
			{
				
				Thread.sleep(random.nextInt(2000));//sleep = Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
				total += i;
				bridge.set(i);
				System.out.println("\t " + total);
			} 
			
			catch (InterruptedException e) {}
			
		}
	}

}
