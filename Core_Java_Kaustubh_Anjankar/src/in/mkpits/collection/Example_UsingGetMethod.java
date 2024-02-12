package in.mkpits.collection;

import java.util.ArrayList;

public class Example_UsingGetMethod {

	public static void main(String[] args) 
	
	{
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Kaustubh");
		obj.add("Anjankar");
		obj.add("Ashik");
		obj.add("Pranav");
		
		System.out.println("List"+obj);
		
		String first = obj.get(0);
		String second = obj.get(2);
		String third = obj.get(3);
		String fourth = obj.get(1);
		
		System.out.println("New List:-"+second);
		
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		
		obj1.add(25);
		obj1.add(12);
		obj1.add(13);
		obj1.add(29);
		
		System.out.println("Integer List - "+obj1);
//		
//		int first1 = obj1.get(2);
//		int second2 = obj1.get(1);
//		int third3 = obj1.get(0);
		
		
		System.out.println(obj1.get(2).equals(14));

	}

}
