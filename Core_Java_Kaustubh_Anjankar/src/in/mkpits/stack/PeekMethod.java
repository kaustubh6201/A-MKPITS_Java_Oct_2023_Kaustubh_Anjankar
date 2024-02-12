package in.mkpits.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PeekMethod {

	public static void main(String[] args)
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Range :- ");
		int range;
		try {
			range = Integer.parseInt(br.readLine());
		
		Stack<String> str = new Stack<String>();
		for (int i = 0; i < range; i++) 
		{
			str.push(br.readLine());
			
		}
		System.out.println("New List :- "+str);

		System.out.println(str.peek());
		str.peek();//only gives the last variable from output
		//peek method cannot removes the variable 
		
		System.out.println("Updated List :-  "+str.peek());
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
