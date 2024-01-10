package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwappingMethod {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		
		System.out.println("Before Swap");
		System.out.println("the value of a is :-"+a);
		System.out.println("the value of b is :-"+b);
		
		int num = a;
		    a = b ;
		    b = num;
		
		    System.out.println("After Swap");
			System.out.println("the value of a is :-"+b);
			System.out.println("the value of b is :-"+a);
		
		
		
		

	}

}
