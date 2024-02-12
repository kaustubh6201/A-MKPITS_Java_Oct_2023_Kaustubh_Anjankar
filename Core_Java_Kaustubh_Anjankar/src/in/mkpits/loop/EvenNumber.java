package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumber {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Print the range of even number ");
		int num =Integer.parseInt(br.readLine());
		System.out.println("List of Even no from 1 to "+ num + " is:-");
		for (int i=0; i<=num; i++)
		{
		if (i%2==0)
		{
			System.out.println(i+" ");
		}
		}
		

	}

}
