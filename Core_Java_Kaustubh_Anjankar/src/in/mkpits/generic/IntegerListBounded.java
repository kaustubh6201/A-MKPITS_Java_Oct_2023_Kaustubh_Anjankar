package in.mkpits.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerListBounded {

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(25);
		num.add(26);
		num.add(46);
		num.add(92);
		num.add(63);
		
		System.out.println("--Using foreach Loop--");
		for (Integer intr : num)
		{
			System.out.println("The CityName is :- "+intr);
			
		}
		System.out.println("-------------------------------");
	
	   System.out.println("--By using for loop--");
	
	   for (int i = 0; i < num.size(); i++) 
	  {
	   System.out.println("Number is :- "+num.get(i));
	  }
	   System.out.println("-------------------------------");
	   
	   System.out.println("--By using iterator Class--");
		Iterator<Integer> inter = num.iterator();
		while (inter.hasNext()) 
		{
			Integer type1 = (Integer) inter.next();
			System.out.println("Number is :- "+type1);
	
		}
	}
}
