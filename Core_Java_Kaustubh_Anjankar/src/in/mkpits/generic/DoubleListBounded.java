package in.mkpits.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleListBounded {

	public static void main(String[] args) 
	{
		ArrayList<Double> dob = new ArrayList<>();
		dob.add(22.3);
		dob.add(12.3);
		dob.add(15.3);
		dob.add(48.1);
		
		System.out.println("--Using foreach Loop--");
		for (Double db : dob)
		{
			System.out.println("The Number is :- "+db);
			
		}
		System.out.println("-------------------------------");
		
		System.out.println("--By using for loop--");
		
		   for (int i = 0; i < dob.size(); i++) 
		  {
		   System.out.println("Number is :- "+dob.get(i));
		  }
		   System.out.println("-------------------------------");
		   
		   System.out.println("--By using iterator Class--");
			Iterator<Double> dub = dob.iterator();
			while (dub.hasNext()) 
			{
				Double type2 = (Double) dub.next();
				System.out.println("Number is :- "+type2);
		    }
			
	}	

}
