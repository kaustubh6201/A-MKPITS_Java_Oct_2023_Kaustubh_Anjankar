package in.mkpits.hashmap;

import java.util.HashMap;

public class HashContainsMethod {

	public static void main(String[] args)
	{
		
	HashMap<Integer, String> obj = new HashMap<>();
		
		obj.put(25, "Kaustubh");
		obj.put(13, "Ashik");
		obj.put(14, "Pranav");
		obj.put(96, "Regved");
		
		 // Check if an element is present in the HashMap
	      System.out.println(obj.containsKey(13));
	      //only key will  accept
	      // Output: True
	      
	      // Get the size of the HashMap
	      System.out.println(obj.size()); //4


	}

}
