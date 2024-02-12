package in.mkpits.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Example_6 {

	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter The Number :- ");
		int range;
			range = Integer.parseInt(br.readLine());
			
			Set<Integer> obj = new HashSet<Integer>();
			
			for (int i = 0; i < range ; i++) 
			{
				obj.add(Integer.parseInt(br.readLine()));
				
			}
			obj.forEach(System.out::println);
			System.out.println("Check the number");
			int obj1 = Integer.parseInt(br.readLine());
			
		   if (obj.contains(obj1))
		   {
			System.out.println("* Number is Present *");
		   } 
		   else {
			   System.out.println("Number is not Present!!");

		   }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
