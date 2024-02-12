package in.mkpits.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue2 {

	public static void main(String[] args)
	{
		Queue<Integer> intr = new LinkedList<Integer>();
		
		intr.add(25);
		intr.add(12);
		intr.add(16);
		intr.add(24);
		intr.add(19);
		
		System.out.println("Queue is :- "+intr);
		
//	  intr.remove();
//	  System.out.println("After Removing the element"+intr);
//	  
//	  intr.poll();
//	  System.out.println(intr);
//	  
//	  
//		intr.remove(24);
//		System.out.println(intr);
//		
		 intr.poll();
		 //Remove the head of the queue 
		 // if queue is empty return the null 
		 System.out.println(intr);
		 
		 intr.element();
		 //It does not remove the head if the element
		 System.out.println(intr);
		
		
	}

}
