package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class OddNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Range of Odd Number : ");
		
		int num = Integer.parseInt(br.readLine());
		  System.out.println("Odd Number is :- ");
		  
		 for ( int i =0; i<=num; i++) 
		 {
		if (i%2==0+1)	 
		{
			System.out.println(i+" ");
		}
		 }

	}  

}
 