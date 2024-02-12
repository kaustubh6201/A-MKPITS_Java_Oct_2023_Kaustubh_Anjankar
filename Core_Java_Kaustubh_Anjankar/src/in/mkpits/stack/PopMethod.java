package in.mkpits.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PopMethod {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Range :- ");
		int range;
		range = Integer.parseInt(br.readLine());
		
		Stack<String> str = new Stack<String>();
		for (int i = 0; i < range; i++) 
		{
			str.push(br.readLine());
			
		}
		System.out.println("New List :- "+str);
		
		str.pop();//In this Method Last IN First OUT
	    //and the value also
		
		System.out.println(str.pop());
		System.out.println("Updated List :- "+str);
		
		

	}

}
