package in.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EachArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //System.out.println("Enter the Range");
		 // int range=Integer.parseInt(br.readLine());
		  
		 String num[] = new String[5];
		  
		  for (int i = 0; i < num.length; i++)
		  {
			  System.out.println("enter data");
			  num[i] =  br.readLine();
			   
		  }
		  System.out.println("-----------------------");
		  for (int i = 0; i < num.length; i++) 
		  {
			  System.out.println("data printing....");
			System.out.println(num[i]);
		  }
  
  
	}

}
