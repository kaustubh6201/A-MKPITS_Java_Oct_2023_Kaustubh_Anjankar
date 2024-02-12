package in.mkpits.collection;

import java.util.ArrayList;
import java.util.List;

public class ExamleNo1 {

	public static void main(String[] args)
	{

		// Creating an object of List interface
		List<Integer> lst1 = new ArrayList<Integer>();
		
		// Adding elements to object of List interface

				lst1.add(0, 1);// index 0 value is 1
				lst1.add(1, 2);// index 1 value 2

				System.out.println(lst1);

	        // Declaring object of integer type
				List<Integer> lst2 = new ArrayList<Integer>();

				lst2.add(1);// index 0
				lst2.add(2);// index 1
				lst2.add(3);// index 2

				lst1.addAll(1, lst2);
		
				System.out.println(lst1);
				System.out.println(lst1.size());
	 
		        
				lst1.remove(1);// Removes element from index 1
		 
		       
				System.out.println(lst1); // Printing the updated List 1
		 
		        
		        // using get() method  // Prints element at index 3 in list 1
				System.out.println(lst1.get(3));
 
		        // Replace 0th element with 8
		        // in List 1
				lst1.set(0, 8);
		 
     	        // Again printing the updated List 1
				System.out.println(lst1);

	}

}
