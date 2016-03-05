package professional;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;

public class Systems {

	public static void main(String[] args) throws IOException 
	{
	 
		Properties p = System.getProperties();//Returns the current system properties.
		System.out.println(p.getProperty("java.version"));//Searches for the property with the specified key in this property list.
		p.setProperty("xti.java.course.version", "1.0");
	 
		/*
		Set<Object> pk = p.keySet();//SET -> A collection that contains no duplicate elements; KEYSET-> Returns a Set view of the keys contained in this map.
		for (Object key : pk) 
		{
			System.out.println(key + ": " + (p.get(key))); //For each object key in pk returns the key --> Returns all properties of the system.  
		}//get -->Returns the value to which the specified key is mapped;
		*/
		
		Console c = System.console();// Returns the unique Console object associated with the current Java virtual machine, if any.
		System.out.println("Enter your user:");
		String user = c.readLine();//Reads a single line of text from the console
		System.out.println("Enter your password:");
		char[] pass = c.readPassword();//Reads a password or passphrase from the console with echoing disabled
		
		System.out.println("Your user is: " + user + " and your password is: " + new String(pass));
		
		
		Runtime.getRuntime().exec("notepad");// Execute the defined string with the process name of the system.
		
	}

}
