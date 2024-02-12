package in.mkpits.collection;

import java.util.ArrayList;

public class Example_ContainsMethod {

	public static void main(String[] args) 
	{
	ArrayList<Integer> obj1 = new ArrayList<Integer>();
		
		obj1.add(25);
		obj1.add(12);
		obj1.add(13);
		obj1.add(29);
		
		System.out.println(obj1);

		//Only boolean method is used
		boolean ispresent = obj1.contains(12);
		System.out.println(ispresent);
		
	}

}
