package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonaciiMethod {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("-----fabonacii method------");
		
		int a=0;
		int b=1;
		System.out.println(a+ "\n" +b);
		
		for (int i= 0 ; i<= 10 ;i++)
		{
			int c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		 
		

	}

}
