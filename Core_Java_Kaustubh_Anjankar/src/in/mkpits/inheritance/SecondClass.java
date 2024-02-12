package in.mkpits.inheritance;

import java.awt.geom.GeneralPath;

public class SecondClass extends FirstClass {
	long Number;
	String gender;
	int pincode;
	void getMobile (long Number)
	{
		this.Number=Number;
		
	}

	void getGender (String gender ) 
	{
		this.gender=gender;
	
		
	}
	 void getPincode (int pincode) 
	 {
		 this.pincode=pincode;
		 
		 
	 }
	
}
