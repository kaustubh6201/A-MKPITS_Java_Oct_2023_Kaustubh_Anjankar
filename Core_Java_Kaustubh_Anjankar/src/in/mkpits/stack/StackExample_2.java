package in.mkpits.stack;

import java.util.Stack;

public class StackExample_2 {

	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		//push element onto the stack
		stack.push(22);
		stack.push(63);
		stack.push(41);
		stack.push(13);
		stack.push(74);
		
		//System.out.println(stack.peek());

		//otherwise used the while isempty() method
		
		System.out.println("---------");
		
		while (!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
