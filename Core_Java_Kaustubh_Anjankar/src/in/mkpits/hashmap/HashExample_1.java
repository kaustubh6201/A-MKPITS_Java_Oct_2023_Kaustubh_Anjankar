package in.mkpits.hashmap;

import java.util.HashMap;

public class HashExample_1 {

	public static void main(String[] args)
	{
		
	      HashMap<String, Integer> hashMap = new HashMap<>();
	       
	      // Add elements to the HashMap
	      hashMap.put("Pranav", 25);
	      hashMap.put("Raj", 30);
	      hashMap.put("Kaustubh", 35);
	      
	      System.out.println(hashMap.get("Kaustubh")); 
	      //get() method gives the value of the key()Kaustubh 
	       
	      // Remove an element from the HashMap
	      hashMap.remove("Kaustubh");
	      //only key will remove  because key has uniq element 
	      
	      System.out.println(hashMap);
	       
	      // Check if an element is present in the HashMap
	      System.out.println(hashMap.containsKey("Jim")); 
	      // Output: false
	       
	      // Get the size of the HashMap
	      System.out.println(hashMap.size()); 

	}

}
