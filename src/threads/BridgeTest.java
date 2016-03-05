package threads;

public class BridgeTest {

	public static void main(String[] args) 
	{
		//Bridge bridge = new UnsynchronizedBridge();
		Bridge bridge = new SynchronizedBridge();
		new Thread (new Producer(bridge)).start();
		new Thread (new Consumer(bridge)).start();
	}

}
