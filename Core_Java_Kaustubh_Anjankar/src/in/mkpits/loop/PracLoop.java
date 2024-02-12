package in.mkpits.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class PracLoop {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
	BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Table is:-");
	
	int a = Integer.parseInt(br.readLine());
    int multiply;

	for (int i=1;i<=10;i++) 
	{
		
		System.out.println(a*i);
	}
	 System.out.println("The End");

	}

}
