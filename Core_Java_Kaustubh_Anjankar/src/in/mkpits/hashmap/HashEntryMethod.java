package in.mkpits.hashmap;

import java.util.HashMap;

public class HashEntryMethod {

	public static void main(String[] args) 
	{
		 HashMap<Integer, String> entry = new HashMap<Integer, String>(); 
		 
	        entry.put(10, "Maharashtra"); 
	        entry.put(15, "Andra"); 
	        entry.put(20, "Madhya"); 
	        entry.put(25, "Punjab"); 
	        entry.put(30, "kashmir"); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings :- " + entry); 
	  
	        // Using entrySet() to get the set view 
	        System.out.println("The set is: " + entry.entrySet()); 
	    } 

	}


