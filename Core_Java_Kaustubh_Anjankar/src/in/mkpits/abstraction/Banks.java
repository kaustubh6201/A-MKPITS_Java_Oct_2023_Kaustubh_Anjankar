package in.mkpits.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Banks extends BankName {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	@Override
	public void hdfc() throws NumberFormatException, IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Bank Loan");
		System.out.println("Enter The Required Loan amount");
		long  bl = Long.parseLong(br.readLine());
		System.out.println();
		
	}

	@Override
	public void canara() throws NumberFormatException, IOException 
	{
		
  	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("create account");
		System.out.print("Enter Account num :-");
        long ac = Long.parseLong(br.readLine());
	}

	@Override
	public void icic() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void bob() throws IOException 
	{
		System.out.print("Enter account Holder Name :-");
		String fn =  br.readLine();
		
		

	}

}
