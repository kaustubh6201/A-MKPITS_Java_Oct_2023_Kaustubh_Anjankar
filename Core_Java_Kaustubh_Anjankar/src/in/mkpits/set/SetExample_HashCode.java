package in.mkpits.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample_HashCode {

	public static void main(String[] args)
	{
		
			Set<String> obj = new HashSet<String>();
			
			//It gives the Random Value in Integer and String Method
			obj.add("5");
			obj.add("4");
			obj.add("3");
			obj.add("8");
			obj.add("9");
			
			System.out.println("Hash Code Value is :-"+obj.hashCode());
			

	}

}
