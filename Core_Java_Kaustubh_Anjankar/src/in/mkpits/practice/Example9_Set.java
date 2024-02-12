package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example9_Set {

	public static void main(String[] args)
	{
		 Set<Integer> arr = new HashSet<Integer>(); 
		  
	    
	        arr.add(1); 
	        arr.add(2); 
	        arr.add(3); 
	        arr.add(4); 
	  
	        System.out.println("Set :- " + arr); 
	  
	        // Get the hashCode value using hashCode value  
	        //it gives the random integer value 
	        System.out.println("HashCode value: " + arr.hashCode()); 

	}

}
