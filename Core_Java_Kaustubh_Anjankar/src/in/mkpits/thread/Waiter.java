package in.mkpits.thread;

public class Waiter implements Runnable{

	private Message msg;
	


	public Message getMsg() {
		return msg;
	}

	public void setMsg(Message msg) {
		this.msg = msg;
	}

	public Waiter(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println(name+"Started waiting to get notified at :"
			                    +System.currentTimeMillis());
				msg.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"waiter thread got notified at "+System.currentTimeMillis());
			System.out.println(name+"proceed :"+msg.getMsg());
		}
		
	}
}


