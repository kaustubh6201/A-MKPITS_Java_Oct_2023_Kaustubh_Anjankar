package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

public class Example8_Set {

	public static void main(String[] args) 
	{
		
        Set<String> set = new HashSet<String>();
       
        set.add("Jai"); 
        set.add("Bhavani"); 
        set.add("jai"); 
        set.add("Shivaji"); 

        System.out.println("Set 1: "+ set); 
       
        Set<String>  set2 = new HashSet<String>(); 
        
  		set2.add("kaustubh"); 
        set2.add("anjankar"); 
        set2.add("Shivaji"); 
        set2.add("city"); 
        set2.add("Hot"); 
  
        System.out.println("Set 2: " + set2); 
         
        System.out.println("Does set 1 contains set 2 :- "+ set.containsAll(set2)); 
         //false
         //containsall() method check if all the elements in each set are same or not
    } 

	

}
