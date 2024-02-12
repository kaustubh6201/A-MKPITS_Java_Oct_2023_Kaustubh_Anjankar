package in.mkpits.basic;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AssignmentOperator obj = new AssignmentOperator();
		obj.kaustubh();
		obj.clas();
		obj.asus();
		obj.panya();
		obj.mouse();
		
		
	}

	public static void mouse() {
		// TODO Auto-generated method stub
		float f=2.35f,h=5.54f;
		System.out.println(""+(f%=h));
	}


	private void panya() {
		// TODO Auto-generated method stub
		int k=9,g=4;
		System.out.println(""+(k-=g));
		
	}

	private void asus() {
		// TODO Auto-generated method stub
		short h=55, d=5;
		System.out.println(""+(h*=d));
	}

	private void clas() {
		// TODO Auto-generated method stub
		long x=14,h=5;
		System.out.println(""+(x+=h));
	}

	private void kaustubh() {
		// TODO Auto-generated method stub
		int x=8,b=5;
		System.out.println(""+(x==b));
		
	}

}
