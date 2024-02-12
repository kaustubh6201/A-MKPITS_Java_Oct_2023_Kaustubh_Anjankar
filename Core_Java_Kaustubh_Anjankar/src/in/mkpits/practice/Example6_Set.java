package in.mkpits.practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Example6_Set {

	public static void main(String[] args) 
	{
		 Set<String> obj = new TreeSet<String>(); 
		  
	        // Use add() method to add elements into the Set 
		  
   		    obj.add("kaustubh"); 
	        obj.add("anjankar"); 
	        obj.add("nagpur"); 
	        obj.add("city"); 
	        obj.add("Hot"); 
	       
	        System.out.println("Initial Set :- " + obj); 
	  
	        // An array collection is created 
	        ArrayList<String> collect = new ArrayList<String>(); 
	        collect.add("Insta"); 
	        collect.add("Whatsapp"); 
	        collect.add("Snap"); 
	  
	        // Using addAll() method to add the two list
	        obj.addAll(collect); 
	
	        System.out.println("Final Set :- " + obj); 
	    

	}

}
