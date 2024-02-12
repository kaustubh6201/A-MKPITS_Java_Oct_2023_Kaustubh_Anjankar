package in.mkpits.stack;

import java.util.Stack;

public class StackExample_3 {

	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
		
		stack.push(15);
		stack.push(18);
		stack.push(19);
		stack.push(20);
		stack.push(21);
		stack.push(22);
		
		System.out.println("Initial Stack :- "+stack);

		System.out.println("***************");

		// Removing elements using pop() method
		System.out.println("POP Element :- "+stack.pop());
		
		System.out.println("***************");
		
		//remove one more element
		System.out.println("Again POP :- "+stack.pop());
		
		System.out.println("***************");
		
		System.out.println("Updated Satck List :- "+stack);
	}

}
