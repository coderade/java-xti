package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilities {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args)
	{
		List <String> fruits = new ArrayList<String>();
		fruits.add ("coconut");
		fruits.add ("grapes");
		fruits.add ("pineaple");
		fruits.add ("watermelon");
		fruits.add ("apple");
		
		
		Collections.sort(fruits);//Sorts the specified list into ascending order, according to the natural ordering of its elements
		System.out.println(fruits.toString());
		
		Collections.reverse(fruits);//Reverses the order of the elements in the specified list
		System.out.println(fruits.toString());
		
		Collections.shuffle(fruits);//Randomly permutes the specified list using a default source of randomness
		System.out.println(fruits.toString());

		Collections.addAll(fruits, "orange", "peach");//Adds all of the specified elements to the specified collection
		System.out.println(fruits.toString());
		
		System.out.println(Collections.frequency(fruits, "peach") + " time(s)");//Returns the number of elements in the specified collection equal to the specified object.
		
		List<String> vegetables = Arrays.asList("carrot", "tomato"); //Returns a fixed-size list backed by the specified array.
		System.out.println(Collections.disjoint(fruits,vegetables)); //Returns true if the two specified collections have no elements in common.
		
		Collections.sort(fruits);
		System.out.println(Collections.binarySearch(fruits, "watermelon"));//Searches the specified list for the specified object using the binary search algorithm
		
		Collections.fill(vegetables, "beans");//Replaces all of the elements of the specified list with the specified element
		System.out.println(vegetables);
		
		Collection beans = Collections.unmodifiableCollection(vegetables); //Returns an unmodifiable view of the specified collection
	}

}
