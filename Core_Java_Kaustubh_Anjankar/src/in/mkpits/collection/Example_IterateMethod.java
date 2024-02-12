package in.mkpits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example_IterateMethod {

	public static void main(String[] args) 
	{
 
		ArrayList<Integer> obj3 = new ArrayList<>();
		
		obj3.add(25);
		obj3.add(12);
		obj3.add(13);
		obj3.add(29);

		System.out.println(obj3);

		ListIterator<Integer> it = obj3.listIterator();

		
		while (it.hasNext()) {
			System.out.println("Before"+it.next());
			
		}
		while (it.hasPrevious()) {
			System.out.println("After"+it.previous());
		}


	}

}
