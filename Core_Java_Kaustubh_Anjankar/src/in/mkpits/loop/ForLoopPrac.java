package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoopPrac {

	public static void main(String[] args) throws NumberFormatException, IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The Natural No. is:-");
		int num = Integer.parseInt(br.readLine());
		for (int i=0; i<=100; i++)
		{
			
			System.out.println(i);
		}
		
		System.out.println("--The End--");

	}

}
