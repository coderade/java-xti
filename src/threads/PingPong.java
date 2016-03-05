package threads;

public class PingPong extends Thread //-->A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently
{
	String word;
	long time;
	
	public PingPong(String word, long time ) 
	{	
		this.word = word;
		this.time = time;
	}
	
	public void run ()
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
	public static void main(String[] args) 
	{
		new PingPong("Ping", 200).start();//Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread. 
		new PingPong("Pong", 100).start();
		System.out.println("View Trheads ");
	}

}
