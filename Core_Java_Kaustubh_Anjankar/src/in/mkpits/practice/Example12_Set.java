package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example12_Set {

	public static void main(String[] args) 
	{
	
		 Set<String> str = new HashSet<String>();
		 
		    str.add("kaustubh"); 
	        str.add("anjankar"); 
	        str.add("nagpur"); 
	        str.add("city"); 
	        str.add("Hot"); 
	 
	        // Displaying the Set
	        System.out.println("The Set: "+ str);
	                           
	 
	        // Creating the array and using toArray()
	        Object[] arr = str.toArray();
	 
	        System.out.println("The array is:");
	        
	        //use for loop otherwise it gives the location
	        for (int j = 0; j < arr.length; j++)
	        	
	            System.out.println(arr[j]);

	}

}
