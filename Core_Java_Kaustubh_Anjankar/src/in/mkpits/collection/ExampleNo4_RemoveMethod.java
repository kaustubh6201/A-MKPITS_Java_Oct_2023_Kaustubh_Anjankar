package in.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExampleNo4_RemoveMethod {

	public static void main(String[] args)
	{
		// Adding elements to the object
		
		List<String> al = new ArrayList<>();

		// Adding elements to the object
		al.add("Kaustubh");
		al.add("Anjankar");

		// Adding For at 1st indexes
		al.add(0, "For");
		System.out.println("new List:-"+al);
		//new List:-[For, Kaustubh, Anjankar]
		
		al.remove(1);
		System.out.println(al);//remove the 1st index
		
		al.remove("For");// it remove the string value 
		System.out.println(al);

	}

}
