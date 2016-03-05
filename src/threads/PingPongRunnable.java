package threads;

public class PingPongRunnable implements Runnable //The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. The class must define a method of no arguments called run.
{
	String word;
	long time;
	
	public PingPongRunnable(String word, long time ) 
	{	
		this.word = word;
		this.time = time;
	}
	
	@Override
	public void run() 
	{
		try 
		{
			for (int i = 0; i <50; i++)
			{
				System.out.println(word);
				Thread.sleep(time);//Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
			}
		} 
		
		catch (InterruptedException e) 
		{
			return; 
		}
	}

	static Runnable ping = new PingPongRunnable("Ping", 200);
	static Runnable pong = new PingPongRunnable("Pong", 100);
	
	public static void main(String[] args) 
	{
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
	}


	
}
