package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap //An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value. 
{

	public static void main(String[] args) 
	{
		Map<String, String> country = new HashMap<>();
			
		country.put("BR", "BRAZIL");//put - Associates the specified value with the specified key in this map (optional operation).
		country.put("US", "UNITED STATES");
		country.put("CA", "CANADA");
		country.put("UK", "UNITED KINGDOM");
		System.out.println(country);
		
		System.out.println(country.containsKey("US"));//Returns true if this map contains a mapping for the specified key.
		System.out.println(country.containsValue("JAPAN"));//Returns true if this map maps one or more keys to the specified value.
		System.out.println(country.get("CA"));//Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key. 
		country.remove("BR");//Removes the mapping for a key from this map if it is present (optional operation).
		System.out.println(country);
		
		Set<String> keys = country.keySet();//KeySet - Returns a Set view of the keys contained in this map. 
		for (String key : keys)
		{
			System.out.println(key + " : " + country.get(key)); //For each key in keys, returns the key and returns the value to which the specified key mapped 
		}
		
	}
	

}
