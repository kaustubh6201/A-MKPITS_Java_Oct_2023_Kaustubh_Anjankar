package in.mkpits.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample_5 {

	public static void main(String[] args)
	{
		  Set<String> obj = new HashSet<String>(); 
		  
	        // Adding elements into the HashSet 
	        // using add() method 
	        obj.add("India"); 
	        obj.add("Australia"); 
	        obj.add("South Africa"); 
	  
	        // Adding the duplicate element 
	        obj.add("India"); 
	 
	        //In this method duplicate variable not allowed 
	        System.out.println(obj); 
	        System.out.println("**************");
	  
	        // Removing items from HashSet 
	        // using remove() method 
	        obj.remove("Australia"); 
	        System.out.println("Set after removing "+"Australia :- " + obj);
	                   
	        System.out.println("**************");
	  
	        // Iterating over hash set items 
	        System.out.println("Iterating over set:-"); 
	        
	        // Iterating through iterators 
	        Iterator<String> i = obj.iterator(); 
	  
	        // It holds true till there is a single element 
	        // remaining in the object 
	        while (i.hasNext()) 
	  
	            System.out.println(i.next()); 

	}

}
