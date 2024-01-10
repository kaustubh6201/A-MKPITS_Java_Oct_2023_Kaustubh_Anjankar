package in.mkpits.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static double sum= 0;
	static double num1=0,num2=0;
	static int choice;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.println("--Calculations--");
		Calculator c = new Calculator();
		
		
		
        System.out.print("Enter First num:- ");
		
		num1 = Double.parseDouble(br.readLine());
		 
		
		System.out.print("Enter Second num:- ");
		num2 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter Your Choice :- ");
		char ch = 'y';
		while (ch == 'Y' || ch == 'y') {
			
			
		System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
		
		
		String user=br.readLine();
		if(user.isEmpty())
		{
			System.err.println("Please Enter valid choice!!");
			continue;
		}
		choice=Integer.parseInt(user);
		
		
		switch (choice)
		{
		case 1:
			c.addition();
		break;
		
		case 2:
			c.substraction();
		break;
		
		case 3:
			c.multiplication();
		break;	
		
		case 4:
			c.division();
		break;	
		
		default:
			System.err.println("Enter Your correct Choice :- ");
			break;
		    
		}

		System.out.println("Do you Wish to Continue (Y/N) :- ");
		ch =(char) br.read();
		br.readLine();
		continue;
		 
	
		}
	}
		
	


	void addition() throws NumberFormatException, IOException 
	{
		 
		sum = num1+num2;
		
		System.out.println("Addition of "+num1+" and "+num2+" is:- "+sum);
		
		
	}

	public void substraction() throws NumberFormatException, IOException 
	{
	
		sum = num1-num2;
		System.out.println("Substraction of "+num1+" - "+num2+" is:- "+sum);
		
	}

	public void multiplication() throws NumberFormatException, IOException 
	{
		
		
		sum = num1*num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is:- "+sum);
		
		
	}

	 private void division() throws NumberFormatException, IOException 
	 {
	
		
		sum = num1/num2;
		System.out.println("Division of "+num1+" by "+num2+" is :- "+sum);
			
	}


	

}
