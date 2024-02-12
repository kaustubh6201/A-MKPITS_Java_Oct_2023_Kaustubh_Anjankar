package in.mkpits.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ExampleNo2_AddMethod {

	public static void main(String[] args) 
	{
		
		// Creating an object of List interface
		List<String> lst = new ArrayList<>();
		
		lst.add("Kaustubh");
		lst.add("Name");
		lst.add("Place");
		lst.add(1, "Anjankar");
		
		System.out.println(lst);
		
		StringJoiner joiner = new StringJoiner(" # ");
		joiner.add(lst.get(0)).add(lst.get(2));
		
		System.out.println(joiner);
		

	}

}
