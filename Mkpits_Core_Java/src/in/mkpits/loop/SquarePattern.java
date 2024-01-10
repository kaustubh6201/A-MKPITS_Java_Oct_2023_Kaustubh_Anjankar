package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class SquarePattern {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		 
		System.out.println("The Pattern is:- ");
		int rows = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=rows ; i++) 
		{
			for (int j=1; j<=rows; j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

		
	}

}
