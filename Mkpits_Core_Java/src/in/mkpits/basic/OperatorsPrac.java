package in.mkpits.basic;

public class OperatorsPrac {
      
	static double bankNo= 55.248;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int accnum= 1644;
      System.out.println("the account no. is "+accnum);
      
		OperatorsPrac time = new OperatorsPrac();
		time.kaustubh();
		time.way();
		time.my();
		
	phone();
	 System.out.println(""+accnum);
	
	}
        
	public static void phone() {
		// TODO Auto-generated method stub
		OperatorsPrac prjct = new OperatorsPrac();
		System.out.println("the account no is"+bankNo);
		
		StaticMethod user = new StaticMethod();
		System.out.println(""+user.person);
        
	}

	public static void my() {
		// TODO Auto-generated method stub
		StaticPractice obj = new StaticPractice();
		System.out.println(""+obj.petrol);
		
		int d=22,f=6 ;
		int z=d*f;
		System.out.println(""+z);
	}

	public void way() {
		// TODO Auto-generated method stub
		float d=4.55f, f=4.32f;
		System.out.println(""+(d%=f));
		
	}

	public void kaustubh() {
		// TODO Auto-generated method stub
		int a=54,b=7,c=(a+b);
		System.out.println("the addition is "+c);
		
	}
    
}
