package in.mkpits.hashmap;

import java.util.HashMap;

public class HashClear2 {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
		  
        // key elements are in Integer
        hash_map.put(10, "Kaustubh"); 
        hash_map.put(15, "anjnakar"); 
        hash_map.put(20, "ashik"); 
        hash_map.put(25, "raj"); 
        hash_map.put(30, "ashik"); 
  
 
        System.out.println("Initial Mappings :- "+ hash_map); 
  
        // Clearing the hash map using clear() 
        hash_map.clear(); 
  
        // Displaying the final HashMap 
        System.out.println("Finally Map:- " + hash_map); 

	}

}
