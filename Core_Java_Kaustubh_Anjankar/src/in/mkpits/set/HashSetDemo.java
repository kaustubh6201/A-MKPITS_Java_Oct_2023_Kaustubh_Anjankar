package in.mkpits.set;

import java.util.ArrayList;
import java.util.HashSet;

import in.mkpits.generic.ArrayListNonGen;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet<ArrayList> obj = new HashSet();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// Add elements using add method
		list1.add(21);
		list1.add(15);
		list2.add(46);
		list2.add(28);
	    obj.add(list1);
	    obj.add(list2);
	    System.out.println(obj.size());

	}
}