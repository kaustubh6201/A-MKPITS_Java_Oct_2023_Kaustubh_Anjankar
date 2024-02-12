package in.mkpits.hashmap;

import java.util.AbstractMap;
import java.util.IdentityHashMap;

public class MapDemo {

	public static void main(String[] args) 
	{
		AbstractMap<String, Integer>  hash= new IdentityHashMap<String, Integer>(); 
       

    // Mapping int values to string keys 
    hash.put("Geeks", 10); 
    hash.put("4", 15); 
    hash.put("Geeks", 20); 
    hash.put("Welcomes", 25); 
    hash.put("You", 30); 

    // Displaying the AbstractMap 
    System.out.println("Initial Mappings are: "+ hash); 
                       

    // Getting the hashcode value for the map 
    System.out.println("The hashcode value of the map: " + hash.hashCode()); 
                      
} 

	}


