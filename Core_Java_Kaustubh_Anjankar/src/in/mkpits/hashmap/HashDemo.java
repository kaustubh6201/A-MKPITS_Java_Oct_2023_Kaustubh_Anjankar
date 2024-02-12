package in.mkpits.hashmap;

import java.util.HashMap;

public class HashDemo {

	public static void main(String[] args)
	{
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		
		obj.put(25, "Kaustubh");
		obj.put(13, "Ashik");
		obj.put(14, "Pranav");
		obj.put(96, "Regved");
		//if we insert the duplicate key in HashMap
		//it will replace the element of the corresponding key. 
		obj.put(96, "Kaustubh");
		
		//key is always unique 
		//duplicate key is not acceptable
		//but duplicate element in value is acceptable
		
		System.out.println(" HashMap List is :- "+obj);
		
		
		
		
		

	}

}
