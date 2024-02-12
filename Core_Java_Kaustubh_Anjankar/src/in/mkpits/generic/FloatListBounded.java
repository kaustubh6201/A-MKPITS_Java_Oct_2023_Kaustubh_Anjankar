package in.mkpits.generic;

import java.util.ArrayList;
import java.util.Iterator;

import in.mkpits.array.Array;

public class FloatListBounded {

	public static void main(String[] args) 
	{
		ArrayList<Float> flt = new ArrayList();
		flt.add(20.33f);
		flt.add(201.6f);
		flt.add(45.124f);
		flt.add(61.25f);
		
		System.out.println("--Using foreach Loop--");
		for (Float ft : flt)
		{
			System.out.println("The Number is :- "+ft);
			
		}
		System.out.println("-------------------------------");

		
		System.out.println("--By using for loop--");
		
		   for (int i = 0; i < flt.size(); i++) 
		  {
		   System.out.println("Number is :- "+flt.get(i));
		   
		  }
		   System.out.println("-------------------------------");
		   
		   
		   System.out.println("--By using iterator Class--");
			Iterator<Float> flot = flt.iterator();
			while (flot.hasNext()) 
			{
				Float type3 = (Float) flot.next();
				System.out.println("Number is :- "+type3);
		    }
		
	}

}
