package in.mkpits.hashmap;

import java.util.HashMap;

public class HashComputeMethod {

	public static void main(String[] args)
	{
		
		HashMap<String, String> obj = new HashMap<String, String>();
		
		obj.put("kaustubh", "Anjankar");
		obj.put("Aman", "Singh");
		obj.put("ashik", "Tembhre");
		obj.put("Pranav", "Armarkar");
		
		System.out.println("Mapping is :- "+obj);
		
		//in concat method add the two element
		//kaustubh=Anjnakar+Shridhar
		obj.compute("kaustubh",(key, val)-> val.concat("Shridhar"));
		obj.compute("Aman",(key, val)-> val.concat("Name"));
		obj.compute("ashik",(key, val)-> val.concat("Last Name"));
		
		System.out.println("Final Mapping :- "+obj);
		
                

	}

}
