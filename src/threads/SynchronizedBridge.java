package threads;

public class SynchronizedBridge implements Bridge
{	
	private int value = -1;
	private boolean busy = false;
	
	@Override
	public synchronized void set(int value) throws InterruptedException 
	{
		while (busy)
		{
			System.out.print("The bridge is full, the producer must wait!\n");
			wait();//Causes the current thread to wait until another thread invokes the notify() method or the notifyAll() method for this object. 
		}
		System.out.print("Produced: " + value);
		this.value = value;
		busy = true;
		notifyAll();//Wakes up all threads that are waiting on this object's monitor. A thread waits on an object's monitor by calling one of the wait methods. 
	}

	@Override
	public synchronized int get() throws InterruptedException 
	{
		while (!busy)
		{
			System.out.print("Bridge is free, consumer waiting! \n");
			wait();
		}
		
		System.err.print("Consumed: " + value);
		busy = false;
		notifyAll();
		return value;
		
	}
}
