package in.mkpits.hashmap;

import java.util.HashMap;

public class HashCloneMethod {

	public static void main(String[] args)
	{
	
		 // Creating an empty HashMap 
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
 
        // Using put() method add elements
        hash.put(10, "My"); 
        hash.put(15, "Name"); 
        hash.put(20, "is"); 
        hash.put(25, "Kaustubh"); 
        hash.put(30, "Anjankar"); 
  
        // Print and display the HashMap 
        System.out.println("Initial Mappings :- "+ hash); 
  
        // Print and display the cloned HashMap 
        // using clone() method 
        System.out.println("Final Mapping :- "+ hash.clone()); 
                         

	}

}
