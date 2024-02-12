package in.mkpits.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TryCatch {

	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		int x = 90 ,y=0;
	
		try 
		{
			System.out.println(arr[4]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
		System.out.println(x/y);
		}catch (Exception e) {
			e.printStackTrace();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name");
		try {
			String name = br.readLine();
		}catch (IOException e) {
			System.out.println();
		}
		
	}

}
