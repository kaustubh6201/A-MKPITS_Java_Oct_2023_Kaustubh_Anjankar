package in.mkpits.practice;

import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

public class Example1_Set {

	public static void main(String[] args) 
	{
		
			 Set<String> s = new HashSet<String>();
			 
		        // Use add() method to add elements
		        s.add("Welcome");
		        s.add("To");
		        s.add("Nagpur");
		        s.add("Orange");
		        s.add("City");
		        s.add("Thankyou");
		 
		        // Displaying the Set
		        System.out.println("Set: " + s);
	}

}
