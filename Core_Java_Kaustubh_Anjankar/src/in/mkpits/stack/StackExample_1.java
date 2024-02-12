package in.mkpits.stack;

import java.util.Stack;

public class StackExample_1 {

	public static void main(String[] args)
	{
		 
	        Stack<String> stack = new Stack<String>();
	        // Use push() to add elements into the Stack
	        stack.push("Kaustubh");
	        stack.push("Anjankar");
	        stack.push("Pranav");
	        stack.push("Ashik");
	        stack.push("Raj");
	 
	        System.out.println("Initial List :- " + stack);
	 
	        System.out.println("-------------------------");
	        
	        // Fetching the element at the head of the Stack
	        System.out.println("The element at the top of the"
	                           + " stack is: " + stack.peek());
	        
	        System.out.println("-------------------------");
	 
	        // Displaying the Stack after the Operation
	        System.out.println("Final Stack List: " + stack);

	}

}
