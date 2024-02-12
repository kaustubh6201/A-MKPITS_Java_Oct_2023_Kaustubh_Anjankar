package in.mkpits.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) 
	{
		//In this method First In First out FIFO is used 
		Queue<String> str = new LinkedList<String>();
		
		str.add("Kaustubh");
		str.add("Ashik");
		str.add("Pranav");
		str.add(null);

		
		System.out.println("Queue is :- "+str);
		
		str.remove();
		//it remove the first element 
		System.out.println("After removing the Element :-"+str);
		
		String peek = str.peek();
		// Peek method gives the first element
		System.out.println("Peek is :-"+peek);

		str.add(peek);
		// after removing list then add peek(String)//output
		System.out.println(str);
		
		
		
	}

}
