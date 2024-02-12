package in.mkpits.collection;

import java.util.ArrayList;

public class TypeSafety {

	public static void main(String[] args) 
	{
		System.out.println("Generic version");
		
		ArrayList<String> str = new ArrayList<>();
		
		str.add("Nagpur");
		str.add("Koradi");
		str.add("Pune");
		str.add("Amravti");
		
		//str.add(25); compile type error
		
	for (String string : str)
	{
		System.out.println(string);
	}
	
	System.out.println("---------------");

	System.out.println("Non generic version");
	
	ArrayList obj = new ArrayList();
	obj.add("Kaustubh");
	obj.add(22.3f);
	obj.add(203);
	obj.add(true);
	
	  for (Object object : obj) 
	  {
		  System.out.println(object);
		
	}
	
	}

}
