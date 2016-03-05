package threads;
/**
 * A <code>Bridge<code> represents the link of the Producers and Consumers objects information. 
 * The <b>Producers<b> utilize the bridges for save the informations and share the informations
 * with the Consumers which read of the Bridge for to do the processing.
 * 
 *@author Valdeci
 *@version 1.2
 *@since 1.0
 *
 *@see UnsynchronizedBridge
 *@see SynchronizedBridge
 */
public interface Bridge 
{
	/**
	 * Stores the value reported in the bridge. Generally it will be called by the classes producers of data. 
	 * @param value
	 * @throws InterruptedException
	 */
	public void set (int value) throws InterruptedException;
	
	/**
	 * Recover the stored information in the bridge. This method will be called by the classes consumers of data. 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
	
}
