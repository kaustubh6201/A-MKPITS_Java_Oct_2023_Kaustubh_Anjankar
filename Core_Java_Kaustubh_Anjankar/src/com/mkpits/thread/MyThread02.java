package com.mkpits.thread;

public class MyThread02 extends Thread {

		Table t ;
		public MyThread02(Table t) {
			this.t = t;
			
		}
		@Override
		public void run() {
			t.printTable(7);
		}
		
	}


