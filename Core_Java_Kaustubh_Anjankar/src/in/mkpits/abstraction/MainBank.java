package in.mkpits.abstraction;

import java.io.IOException;

public class MainBank {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		Banks bn = new Banks();
		bn.canara();
		bn.hdfc();
		bn.bob();
		bn.name();
		
	}
}

