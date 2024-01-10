package in.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayFile 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		// multi dimensional array
 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int array[][]= {{1,5,3,},{4,9,6}};
		 
		  System.out.println("Enter the value");
		 
		 int num[][]= new int [4][2];
		  
		  for (int i = 0; i < 2 ; i++) {
			  for (int j = 0; j < 3; j++) {
				  System.out.println(array[i][j]);
				
			}
		  }
	}

}
