package com.mkpits.thread;

public class Table {

	synchronized public void  printTable(int n) {
		for (int i = 0; i<=10; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
