package in.mkpits.stack;

import java.util.Stack;

public class StackExample_4 {

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		
		
	                stack.push(" Welcome");
	    	        stack.push(" To");
	    	        stack.push(" Mk");
	    	        stack.push(" Classes");
	    	        stack.push(" Nagpur");
	    
	    	        System.out.println(" Initial Stack"  + stack);
	    	 
	    	        // Pushing elements into the stack
	    	        stack.push(" Hello");
	    	        stack.push(" World");
	    	 
	    	        // the final Stack
	    	        System.out.println(" Final Stack :- "+ stack);

	}

}
