package threads;

import java.util.Random;

public class Consumer implements Runnable
{
	private Bridge bridge;
	
	public Consumer(Bridge bridge) 
	{
		this.bridge = bridge;
	}
	
	private Random random = new Random();
	
	@Override
	public void run() 
	{
		int total =0;
		
		for (int i = 0; i < 5; i++) 
		{
			
			try
			{				
				Thread.sleep(random.nextInt(2000));
				total += bridge.get();
				System.err.println("\t " + total);
			} 
			
			catch (InterruptedException e) {}
			
		}
	}

}
