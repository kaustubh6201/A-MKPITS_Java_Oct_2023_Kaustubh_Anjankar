package in.mkpits.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackExample_5 {

	public static void main(String[] args)
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter Range :- ");
		 int range;
		 try {
			range = Integer.parseInt(br.readLine());
		
		Stack<Integer> stk = new Stack<Integer>();
		
		for (int i = 0; i < range; i++) {
			System.out.println("Updated List :-"+stk.pop());
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
