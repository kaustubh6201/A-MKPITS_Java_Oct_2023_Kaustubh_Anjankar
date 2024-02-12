package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example7_Set {

	public static void main(String[] args) 
	{
		  
		Set<String> string = new HashSet<String>(); 
		
  		string.add("kaustubh"); 
        string.add("anjankar"); 
        string.add("nagpur"); 
        string.add("city"); 
        string.add("Hot"); 
        
        System.out.println("Initial Set :- " + string); 

        string.clear(); 
  
       //After Clear() method used the final list is 
        System.out.println("The final set :- " + string); 

	}

}
