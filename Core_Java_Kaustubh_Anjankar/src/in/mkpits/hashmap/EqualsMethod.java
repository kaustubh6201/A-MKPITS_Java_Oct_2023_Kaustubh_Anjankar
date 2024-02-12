package in.mkpits.hashmap;

import java.util.AbstractMap;
import java.util.IdentityHashMap;

public class EqualsMethod {

	public static void main(String[] args) 
	{
		 AbstractMap<Integer, String> hash = new IdentityHashMap<Integer, String>();
          

     AbstractMap<Integer, String> 
         abstract_hash2 = new IdentityHashMap<Integer, String>(); 

     // Mapping string values to int keys 
     hash.put(10, "Kaustubh"); 
     hash.put(15, "anjnakar"); 
     hash.put(20, "ashik"); 
     hash.put(25, "raj"); 
     hash.put(30, "ashik"); 
     
    
     abstract_hash2.put(10, "Geeks"); 
     abstract_hash2.put(15, "4"); 
     abstract_hash2.put(20, "Geeks"); 
     abstract_hash2.put(25, "Welcomes"); 
     abstract_hash2.put(30, "You"); 

   
     System.out.println("First Map: "+ hash); 
                        


     System.out.println("Second Map: " + abstract_hash2); 
                       

     // Displaying the equality 
     System.out.println("Equality: "+ hash.equals(abstract_hash2));
                         
 } 
	}


