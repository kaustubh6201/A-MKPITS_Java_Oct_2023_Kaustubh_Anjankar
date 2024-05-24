package com.mkpits.thread;

public class MyWorkerThread  extends Thread{

	
		String message;
		

		public MyWorkerThread(String message) {
			super();
			this.message = message;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()
					+"(Start) message = "+message);
			
			processtask(); //call processtask method that sleep
			System.out.println(Thread.currentThread().getName()+"(End)");
			
		}
	
		public void processtask(){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	
	

}
