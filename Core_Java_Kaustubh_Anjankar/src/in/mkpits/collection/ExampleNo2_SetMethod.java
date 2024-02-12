package in.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleNo2_SetMethod {

	public static void main(String[] args)
	{
		List<String> obj = new ArrayList<>();
		
		obj.add("Kaustubh");
		obj.add("Anjankar");
		obj.add("Ashik");
		
		// Setting (updating) element at 1st index
		// using set() method

		obj.set(1, "Pranav");
		System.out.println("New List- "+obj);
		
		obj.set(0, "Ashik");
		System.out.println("updated List- "+obj);
	}

}
