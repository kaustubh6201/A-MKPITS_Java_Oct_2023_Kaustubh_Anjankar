package in.mkpits.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class BankRegistration extends FirstStep
{
	String info,da,amount;
	long balance,amt;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void choice() throws NumberFormatException, IOException
	{
		System.out.println("लेना देना बैंक में आपका स्वागत है !! ");
		char ch = 'y';
		while( ch == 'y' || ch == 'Y') {
	
			System.out.println("Enter Your Choice");	
		System.out.println("1.Registration Form \n2.Deposit \n3.Withdrawl");
		
		int choice = Integer.parseInt(br.readLine());
		
		switch (choice) 
		{
		case 1:
			       registration();
			break;
			
		case 2:
		       deposit();
		break;	
		
		case 3:
		       Withdrawl();
		break;	
	
		
		default:
		System.out.println("Enter Your Choice");	 
			break;
		}
			
		
		System.out.println("Do you wish to Continue  Y/N :-  ");
		 ch = (char) br.read();
		br.readLine();
		}
	
	}


	void registration() throws IOException 
	 {
		System.out.println("-----Registration Form-----");
		System.out.print("a) Your Full Name :- ");
		
		while (true) {
			info = br.readLine();
			if (info.isEmpty())
			{
				System.err.println("cannot be blank!");
				continue;
			}
			break;
		}
 		
		System.out.print("b) Enter Mobile Number :- ");
		
		while(true) {
			 info = br.readLine();
			if (info.isEmpty() || !info.matches("\\d+")|| info.length()!=10) //  ( !=not equals to ) ( || means Addition ) ( \\d+ checking di ) 
			{
				System.err.println("cannot be blank!");
				continue;
			} 
			break;
		}
		
		System.out.print("c) Enter gender :- ");
		
		while(true) {
			
			 info  = br.readLine();
			if (info.isEmpty())
			{
				System.err.println("cannot be blank!");
				continue;
			}
			
			break;
		}
		
		System.out.print("d) Enter  your Email :- ");
		while(true) {
			 info = br.readLine();
			if (info.isEmpty())
			{
				System.err.println("cannot be blank!");
				continue;
			}
		break;
		}
        System.out.print("e) Enter  your Address :-  ");
	    while(true) {
	    	 info = br.readLine();
	    	if (info.isEmpty()) 
	    	{
				System.err.println("cannot be blank!");
				continue;
			}
	    	break;
	    }
	  
	    System.out.print("f) Account Type :- ");
	    while(true) {
	    	 info = br.readLine();
	    	if (info.isEmpty()) 
	    	{
				System.err.println("cannot be blank!");
				continue;
			}
	    	break;
	    }  
	    
	    System.out.print("Deposit Some Amount :- ");
	    balance =Long.parseLong( br.readLine());
	    
	    System.out.println("🤩Congratulation 🤩 \n -- Your  Account has been Created  --");
	    
	 }


	 void deposit() throws IOException
	{
		 
		System.out.println("Enter the Deposit Amount :- ");
		
		while (true) 
		{
		 String da = br.readLine();
		if (da.isEmpty() || !da.matches("\\d+")) 
		{
			System.out.println("cannot be blank!");
			continue;
		}
		//super.amt=da;
		this.da=da;
		amt=Long.parseLong(da);
		
		break;
		
		
		}
	
		
		balance+=amt;
		
		    
	      System.out.println("Total Balance :- "+balance);    
	       // = Long.parseLong(br.readLine());
	       
	      
		
	}

		 void Withdrawl() throws IOException 
		 {
			 System.out.println("Enter the Withdrawl Amount :- ");
			 while (true) 
			 {
				 String amount = br.readLine();
				if (amount.isEmpty() || !amount.matches("\\d+")) 
				{
					System.out.println("cannot be Blank!");
					continue;
				}
				this.amount= amount;
				amt= Long.parseLong(amount);
				break;
			}
			balance-=amt;
			
			System.out.println("Available Balance :- "+balance);
			
		}
	       

	 }
		
		
	


