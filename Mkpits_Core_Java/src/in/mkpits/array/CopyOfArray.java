package in.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("enter size of array = ");
		int range = Integer.parseInt(br.readLine());
		
		 String name[] = new String [range];
		 for (int i = 0; i < name.length; i++)
		 {
			 
			 System.out.println("Enter data of "+i+" location");
			 name[i] = br.readLine();	
		 }
		 
		 System.out.println("-------------------------");
		// for (String string : name) {
			// System.out.print(""+string); 
			
		
		
	}

}
