package in.mkpits.hashmap;

import java.util.HashMap;

public class HashClearMethod {

	public static void main(String[] args)
	{

        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
  
        // Mapping int values to string keys 
        hash_map.put("Kaustubh", 10); 
        hash_map.put("anjankar", 15); 
        hash_map.put("Geeks", 20); 
        hash_map.put("Welcomes", 25); 
        hash_map.put("You", 30); 
  
        System.out.println("Initial Mappings:- " + hash_map); 
  
        // Clearing the hash map using clear() 
        hash_map.clear(); 
  
        // Displaying the final HashMap 
        System.out.println("Finally Map:- " + hash_map); 

	}

}
