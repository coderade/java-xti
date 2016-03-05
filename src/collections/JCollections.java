package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JCollections {

	public static void main(String[] args) 
	{
		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		System.out.println(c.toString());//Returns a string representation of the object
		System.out.println(c.isEmpty());//Returns true if this collection contains no elements
		System.out.println(c.contains("E"));//Returns true if this collection contains the specified element.
		
		//groups
		Collection<String> c2 = Arrays.asList("O","U");
		c.addAll(c2);
		System.out.println(c.toString());
		
		System.out.println(c.containsAll(c2));
		
		c.removeAll(c2);
		
		//Cycle through the elements of a collection
		for (String string : c)
		{
			System.out.println(string);
			
		}
		
		String[] s = c.toArray(new String[c.size()] );//Returns an array containing all of the elements in this collection; 
		System.out.println(Arrays.toString(s));
		
		c.clear();//Removes all of the elements from this collection 
		System.out.println(c.toString());
	}

}
