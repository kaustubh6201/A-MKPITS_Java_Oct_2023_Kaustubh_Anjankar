package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTri {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("--The Triangle Pattern--");
		
		int rows= Integer.parseInt(br.readLine()); 
		for (int i=1;i<=rows;i++)  
		{
			for(int j=1;j>=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
