package in.mkpits.generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args)  
	{
		double petrolPrice = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> obj = new ArrayList<>();
		
		System.out.print("Enter The Range :-");
		int range;
		try {
			range = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < range; i++) 
		{
			System.out.print(i+1+") Enter the privious Year Petrol Prices :- ");
			Double db = Double.parseDouble(br.readLine());
			obj.add(db);
		}

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		for (Double obj1 : obj)
		{
		
			System.out.println("Petrol prices is:- "+obj1);
		}

	}

	}
