package in.mkpits.abstraction;

import java.io.IOException;

public abstract class BankName
{
	abstract public void hdfc() throws NumberFormatException, IOException;
	abstract public void canara() throws NumberFormatException, IOException;
	abstract public void icic();
	abstract public void bob() throws IOException;
	
	
	public static void name()
	{
	System.out.println("   ");
		
	}
	
	

}
