package in.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashExample_2 {

	public static void main(String[] args)
	{
		try{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter The Range :-");
		int range;
		range = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> obj = new HashMap<>();
		System.out.println("Enter the Element :- ");
		
		for (int i = 0; i < range; i++)
		{
			obj.put(br.readLine(), Integer.parseInt(br.readLine()));
		}
		System.out.println("Map is :- "+obj);
		
		System.out.print("Enter the Key :- ");
		String key = br.readLine();
			
		
		if (obj.containsKey(key))
		{
			System.out.println("Element is Present");
			System.out.println("Value is :- "+obj.get(key));
			
		}
		else 
		{		
			System.err.println("Element is Not Present");

		}
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
