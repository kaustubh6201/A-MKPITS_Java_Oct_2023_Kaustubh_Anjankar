package in.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("--Second Largest Number--");
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		Arrays.sort(num);
		
		System.out.println("Second largest number is"+num[num.length-2]);
		
		
	

	}

}
