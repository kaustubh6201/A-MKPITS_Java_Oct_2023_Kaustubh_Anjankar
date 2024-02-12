package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialProgram {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("The number is :- ");
		 
		 int fact =1;
		 int num = Integer.parseInt(br.readLine());
		 //System.out.println("The Multiplication is :-");
		 
		 for (int i=1; i<=num; i++) 
		 {
			 fact = fact*i;
		 }

		 System.out.println("The factorial value of "+ num +" is " +fact);
	}

}
 