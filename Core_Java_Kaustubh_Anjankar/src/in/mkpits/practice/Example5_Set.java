package in.mkpits.practice;

import java.util.Set;
import java.util.TreeSet;

public class Example5_Set {

	public static void main(String[] args) 
	{
		 Set<String> name = new TreeSet<String>(); 
		  
		  
   		    name.add("kaustubh"); 
	        name.add("anjankar"); 
	        name.add("nagpur"); 
	        name.add("city"); 
	        name.add("Hot"); 
	   
	        System.out.println("Set :- " + name); 
	  
	        // Creating another Set 
	        Set<String> st2 = new TreeSet<String>(); 
	  
	        // Use add() method to add elements 
	        
	        st2.add("Hello"); 
	        st2.add("World"); 
	 
	        name.addAll(st2); 
	  
	        // Displaying the final Set 
	        System.out.println("Set :- " + name); 

	}

}
