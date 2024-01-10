package in.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Array {

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
		  System.out.println("Enter values");
		  for (int i = 0; i < 4 ; i++) {
			  for (int j = 0; j < 2; j++) {
				   num[i][j]=Integer.parseInt(br.readLine());
				
			}
		  }
		  System.out.println("Arrays value is");
		  
		  for (int i = 0; i < 4 ; i++) {
			  for (int j = 0; j <2 ; j++) 
			  {
				   System.out.print(num[i][j]+" ");
				
			}
			  System.out.println();
		  }
		  
	}

}
