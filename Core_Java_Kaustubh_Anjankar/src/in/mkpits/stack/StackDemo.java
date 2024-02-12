package in.mkpits.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack  stk1 = new Stack();
		
		Stack<String> stk2 = new Stack<String>();
		
		stk1.push("Kaustubh");
		stk1.push("Anjankar");
		stk1.push("Pranav");
		
		
		stk2.push("ashik");
		stk2.push("Raj");
		
		System.out.println(stk1);

		System.out.println(stk2);
	}

}
