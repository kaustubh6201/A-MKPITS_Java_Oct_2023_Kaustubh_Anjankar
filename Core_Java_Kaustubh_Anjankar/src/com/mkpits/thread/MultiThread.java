package com.mkpits.thread;

public class MultiThread extends Thread{

	@Override
	public void run()
	{
		try {
			Thread.sleep(5000);
			for (int i = 0; i <=5; i++) {
				System.out.println("*-*-*-"+i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}

