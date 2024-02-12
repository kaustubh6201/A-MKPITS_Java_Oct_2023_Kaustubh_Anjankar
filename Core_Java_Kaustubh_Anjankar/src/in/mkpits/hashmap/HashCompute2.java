package in.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashCompute2 {

	public static void main(String[] args)
	{
		
        Map<String, Integer> map = new HashMap<>(); 
        map.put("nagpur", 12); 
        map.put("Koradi", 15); 
  
        System.out.println("Map: " + map);
  
     // remap the values using compute() method 
     // passing null value will throw exception        
        
          map.compute("nagpur", (key, val)-> val+23); 
                                 
            System.out.println("New Map: " + map); 
        } 
//        catch (NullPointerException e) { 
//  
//            System.out.println("Exception: " + e); 

	}


