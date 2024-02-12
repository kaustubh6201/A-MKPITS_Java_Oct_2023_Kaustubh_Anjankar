package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class PatternLoop {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("--The Triangle Pattern--");
		
		int rows= Integer.parseInt(br.readLine()); // otherwise cmnt out the bufer and type int into the rows
		for (int i=1;i<=rows;i++) //rows 
		{
			for(int j=1;j<=i;j++) // column 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
