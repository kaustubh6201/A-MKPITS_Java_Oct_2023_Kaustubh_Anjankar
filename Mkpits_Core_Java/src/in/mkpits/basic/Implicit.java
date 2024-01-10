package in.mkpits.basic;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=20;
        long s=a;
        System.out.println(s);
        
        short f=10, b=5;
        long g=(f+b);
        System.out.println(g);
	
      short k=6, l=9;
      int i=(k+l);
      System.out.println(i);
      
      short o= 52, p=69;
      int t=5,q=56;
      	long w= (o+p)+(t+q);
      	System.out.println(w);
      	
      	byte u=8, h=66;
      	int r=33, x=98;
      	long n= (u-h)+(r+x);
      	System.out.println(n);
      	      	
      	newImplicit();
	}

	public static void newImplicit() {
		// TODO Auto-generated method stub
		float p=25.3f, o= 36.5f;
		double g=(p+o);
		System.out.println(g);
		
		
	}

}
