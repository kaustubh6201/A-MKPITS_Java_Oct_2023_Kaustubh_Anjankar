package in.mkpits.generic;

import java.util.ArrayList;

public class ArrayListNonGen {

	public static void main(String[] args) 
	//non bound type is used in this class
	//non-generic
	{
		ArrayList list = new ArrayList();
		list.add(25);
		list.add("kaustubh");
		list.add(20.36);
		list.add("anjankar");
	}

}
