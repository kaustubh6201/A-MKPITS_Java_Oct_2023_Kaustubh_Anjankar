package in.mkpits.collection;

import java.util.ArrayList;

public class ExampleNo_3IndexOf {

	public static void main(String[] args) 
	{
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		lst.add(25);
		lst.add(32);
		lst.add(15);
		lst.add(32);
		lst.add(1);
		
		// use indexOf() to find the first occurrence of an element
		
		int list = lst.indexOf(32);//to find the 32th number position
		System.out.println("Index of 1 is:-"+list);
		
		// use lastIndexOf() to find the last occurrence of
		
		int lastIndex = lst.lastIndexOf(32);
		System.out.println("Last Index of 32 " + lastIndex);

		System.out.println(lst.lastIndexOf(1));
		System.out.println(lst.indexOf(3));
		

	}

}
