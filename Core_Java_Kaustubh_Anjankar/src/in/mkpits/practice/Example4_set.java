package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example4_set {

	public static void main(String[] args)
	{
		 Set<String> name = new HashSet<String>(); 
		  
      		name.add("kaustubh"); 
	        name.add("anjankar"); 
	        name.add("nagpur"); 
	        name.add("city"); 
	        name.add("Hot"); 
	   
	        System.out.println("Set: " + name); 
	  
	        // Removing elements using remove() method 
	        name.remove("anjankar"); 
	        name.remove("Hot"); 
	  
	        // Displaying the Set after removal 
	        System.out.println("After removing elements :- "+ name); 
	                           
	}

}
