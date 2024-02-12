package in.mkpits.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample_2 {

	public static void main(String[] args) 
	{

		Set<Integer> obj1 = new HashSet<Integer>();
		
		obj1.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
		
		Set<Integer> obj2 = new HashSet<Integer>();
		obj2.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
		
		//In this Method Duplicate value is given
		Set<Integer> intersection = new HashSet<Integer>(obj1);
		intersection.retainAll(obj2);
		System.out.println("Intersection is :-"+intersection);

	}

}
