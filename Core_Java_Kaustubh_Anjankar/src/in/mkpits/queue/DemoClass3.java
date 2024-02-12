package in.mkpits.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class DemoClass3 {

	public static void main(String[] args) 
	{
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<String> ls = new LinkedList<String>();
		
		System.out.println("Enter The Range :- ");
		int range = Integer.parseInt(br.readLine());
		for (int i = 0; i < range; i++) {
			System.out.println("Enter the Name " +(i+1));
			ls.add(br.readLine());
		}
		System.out.println("Your List is :- "+ls);
//		
//		for (int i = 0; i < args.length; i++) {
//			String string = args[i];
//			
		
		System.out.println("Enter the Name that you want to add :- ");
		ls.add(br.readLine());
		System.out.println("Updated List is :- "+ls);
		
		System.out.println("Chech weather the element is present :- ");
		while (true) {
			
		
		if (ls.contains(br.readLine()))
		{
		System.out.println("Element is Present");
		break;
		} else {
			System.err.println("Element is not Present");
			System.out.println("Please Enter Valid Element");
			continue;
			
		}
		}
		System.out.println("Enter the Name That you want to remove :- ");
		ls.remove(br.readLine());
		System.out.println("Updated List is :- "+ls);
		
		
		}catch (Exception e) 
		{
		 e.printStackTrace();
		}

	}

}
