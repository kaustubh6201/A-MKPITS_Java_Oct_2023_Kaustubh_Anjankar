package com.mkpits.thread;

public class MyThread2 implements Runnable
{

	@Override
	public void run() {
	
		for (int index = 5; index <= 10; index++) {
			
			System.out.println("Thread by Runnable Interface"+index+"**");
			
		}
		
	}

	
}
