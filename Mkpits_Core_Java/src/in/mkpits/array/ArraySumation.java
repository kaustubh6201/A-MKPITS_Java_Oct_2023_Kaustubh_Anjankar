package in.mkpits.array;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySumation {

	// Summation of Array 
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Sumation of Array ");
		int a;
		int[] num = {1,2,3,4,5,6,7,8,59,20};
		a = Integer.parseInt(br.readLine());
		int sum = 0;

		for ( int i = a; i < num.length; i++) 
		{
			
			sum = sum+num[i];
		}
		
		System.out.println("Sumation of all Element is:- "+sum);

	}

}
