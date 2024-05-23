package com.mkpits.thread;

public class Application {

	public static void main(String[] args) {
		
		MyThread myt = new MyThread();
		myt.start();
		
		MyThread2 run = new MyThread2();
		Thread myt2 = new Thread(run);
		myt2.start();
		
	}

}
