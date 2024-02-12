package in.mkpits.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample_4 {

	public static void main(String[] args) 
	{
		Set<String> obj = new HashSet<String>();
		
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		obj.add("E");
		
		System.out.println("The Hash set element is :- "+obj);
		
		/// Removing custom element 
        // using remove() method 
		obj.remove("C");
		System.out.println("The FInal List :-"+obj);
		

	}

}
