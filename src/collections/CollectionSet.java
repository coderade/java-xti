package collections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet //A collection that contains no duplicate elements
{
	public static void main(String[] args) 
	{
		String[] collors = {"green", "blue", "yellow","white", "green"};
		List<String> collor = Arrays.asList(collors);
		System.out.println(collor);
		
		Set<String> set = new HashSet<>(collor);//Constructs a new set containing the elements in the specified collection.
		System.out.println(set.toString());
		
		
	}

}
