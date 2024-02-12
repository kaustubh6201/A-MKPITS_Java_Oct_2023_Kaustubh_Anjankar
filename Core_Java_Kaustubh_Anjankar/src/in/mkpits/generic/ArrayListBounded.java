package in.mkpits.generic;

import java.util.ArrayList;
import java.util.Iterator;

import in.mkpits.interfaces.CityName;

public class ArrayListBounded {

	public static void main(String[] args)
	{
		ArrayList<String> cityName = new ArrayList<String>();
		cityName.add("Nagpur");
		cityName.add("Koradi");
		cityName.add("Amaravati");
		cityName.add("wardha");
		cityName.add("Yavatmal");
		
		System.out.println("--Using foreach Loop--");
		for (String obj : cityName)
		{
			System.out.println("The CityName is :- "+obj);
			
		}
		System.out.println("-------------------------------");
		
		
		System.out.println("--By using for loop--");
		
		for (int i = 0; i < cityName.size(); i++) 
		{
		System.out.println("CityName is :- "+cityName.get(i));
		}
		System.out.println("-------------------------------");
				
		System.out.println("--using iterator Class--");
		Iterator<String> str = cityName.iterator();
		while (str.hasNext()) 
		{
			String type = (String) str.next();
			System.out.println("CityName is :- "+type);
			
		}
	
	
	}

}
