package in.mkpits.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example10_Set {

	public static void main(String[] args) 
	{
		 Set<String> string = new HashSet<String>(); 
		  
	        // Use add() method to add elements into the Set 
		  
   		    string.add("kaustubh"); 
	        string.add("anjankar"); 
	        string.add("nagpur"); 
	        string.add("city"); 
	        string.add("Hot"); 
	       
	        
	        System.out.println("Set: " + string); 
	  
	        Iterator value = string.iterator(); 
	  
	        // Displaying the values after iterating 
	        System.out.println("The iterator values are: "); 
	        
	        while (value.hasNext()) 
	        { 
	            System.out.println(value.next()); 
	        } 
	        
	    } 
		

	}


