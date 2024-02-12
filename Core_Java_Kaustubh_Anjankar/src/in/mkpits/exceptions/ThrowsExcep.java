package in.mkpits.exceptions;


public class ThrowsExcep {

	public static void main(String[] args) 
	{
		ThrowsExcep demo = new ThrowsExcep();
		demo.Square(-1);
		demo.Square(5);
	}

	 void Square(int n) 
	 {
	try {
		if (n < 0) {
			throw new ExceptionClass();
				} else {
					int r = n * n;
					System.out.println("Square of " + n + " = " + r);
				}
		
			} catch (Exception e) {
			
				System.out.println(e); 
			}
		
	}

}
