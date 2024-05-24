package in.mkpits.thread;

public class Notifier implements Runnable{

	private Message msg;

	public Notifier(Message msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+"started");
		
		try {
			Thread.sleep(5000);
			synchronized (msg) {
				msg.setMsg(name+"work done");
				msg.notify();
				msg.notifyAll();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	
}
