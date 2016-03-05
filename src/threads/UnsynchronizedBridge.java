package threads;

public class UnsynchronizedBridge implements Bridge
{
	private int value = -1;
	@Override
	public void set(int value) throws InterruptedException 
	{
		System.out.print("Produced: " + value);
		this.value = value;
	}

	@Override
	public int get() throws InterruptedException 
	{
		System.err.print("Consumed: " + value);
		return value;
	}

}
