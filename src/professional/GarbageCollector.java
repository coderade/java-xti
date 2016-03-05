package professional;

import java.util.ArrayList;
import java.util.List;


public class GarbageCollector {

	public static long loadMemory()
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <10000000; i++) 
		{
			list.add(i);
		}

		return Runtime.getRuntime().freeMemory();//Returns the amount of free memory in the Java Virtual Machine. 
	}
	
	public static void main(String[] args) 
	{
		Runtime rt = Runtime.getRuntime();//Returns the runtime object associated with the current Java application.
		int megabyte = 1_048_576; //--> bytes in a megabyte. 
		double mbMax = rt.maxMemory()/megabyte;//Returns the maximum amount of memory that the Java virtual machine will attempt to use.

		double mbUse = mbMax - (loadMemory()/megabyte);// max memory - free memory
		
	
		rt.runFinalization();//Runs the finalization methods of any objects pending finalization.
		rt.gc();//Runs the garbage collector.
		
		double end = mbMax- (rt.freeMemory()/megabyte);
		
		System.out.println("Memory in use: " + mbUse);
		System.out.println("Final memory in use: " + end);
		
	}

}
