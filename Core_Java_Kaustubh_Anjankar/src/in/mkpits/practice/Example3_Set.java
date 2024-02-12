package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example3_Set {

	public static void main(String[] args) 
	{
	
		 Set<String> set = new HashSet<String>(); 
		  
	        // Using add() method to add elements into the Set 
	        set.add("kaustubh"); 
	        set.add("anjankar"); 
	        set.add("nagpur"); 
	        set.add("city"); 
	        set.add("Hot"); 
	  
	        
	        System.out.println("Set :- " + set); 
	    
	        System.out.println("Does the Set contains 'Nagpur'? "+ set.contains("nagpur"));
	                            
	  
	        // Check for "4" in the set 
	        System.out.println("Does the Set contains '4'? "
	                           + set.contains("4")); 
	  
	        // Check if the Set contains "No" 
	        System.out.println("Does the Set contains 'Capital'? "
	                           + set.contains("Capital")); 

	}

}
