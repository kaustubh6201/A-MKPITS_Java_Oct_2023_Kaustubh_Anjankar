package in.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallingInheritance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		SecondClass sc = new SecondClass();
		
		System.out.print("Enter the First Name :-");
	    sc.firstName = 	br.readLine();
		while(sc.firstName.isEmpty())
		{
	       System.out.println("Please enter first name");
	       sc.firstName = br.readLine();
	         
		}
		
		System.out.print("Enter the Last Name :-");
		sc.lastName = br.readLine();
		while (sc.lastName.isEmpty()) 
		{
			System.out.println("Please enter Last Name");
			sc.lastName = br.readLine();
		}
		
		System.out.print("Enter your Email :-");
		sc.email =br.readLine();
       while (sc.email.isEmpty());
       {
    	   System.out.println("Plese enter email");
       sc.email = br.readLine();
       
       }
       
	    System.out.print("Enter your Mobile Num :-");
	     sc.getMobile(Long.parseLong(br.readLine()));
	     
	    System.out.print("Enter your Gender :-");
	    sc.getGender(br.readLine());
	    
	    System.out.print("Enter Pincode :-");
	    sc.getPincode(Integer.parseInt(br.readLine()));
	    
	    
	    
	}

}
