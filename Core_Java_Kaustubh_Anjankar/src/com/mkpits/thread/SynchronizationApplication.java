package com.mkpits.thread;

public class SynchronizationApplication {

	public static void main(String[] args) {
		
		Table table1 = new Table();
		
		MyThread1 t1 = new MyThread1(table1);
		MyThread02 t2 = new MyThread02(table1);
		t1.start();
		t2.start();

	}

}
