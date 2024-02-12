package in.mkpits.basic;

public class Operators {

	public static void main(String[] args) {
		// calling method
  Operators o = new Operators();
  o.getsub();
  o.getAdd();
  o.getdivide();
  o.getmultiply();
  o.getmult();
		
	}
   
	private void getmult() {
		// TODO Auto-generated method stub
		int g=8256,h=5425;
		int s=g*h;	
		System.out.println(""+s);
	}

	private void getmultiply() {
		// TODO Auto-generated method stub
		
		double g=35,f=6,y=g*f;
		System.out.println(""+y);
	}

	private void getdivide() {
		// called method
		float a=55,b=22,g=a/b;
		System.out.println(""+g);
	}

	private void getsub() {
		// TODO Auto-generated method stub
		long h=6812556125l,g=64643345l,s=h-g;
		System.out.println(""+s);
	}

	public void getAdd() {
		// TODO Auto-generated method stub
		
		int a=62,b=25, c=a+b;
		System.out.println(""+c);
	}

}
