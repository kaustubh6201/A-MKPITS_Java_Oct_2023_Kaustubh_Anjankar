package in.mkpits.loop;

public class DoWhileLoopClass {

	public static void main(String[] args) 
	{
		int num1=10;
		int num2=10;
		int add;
		
		int i=1; // initialization loop 
		
		do //doing some operation 
		{
			add=num1+num2; // performing logical operation
			System.out.println(add);
			i++; 
		} while(i<=10); // Checking cond
		
		
		System.out.println("loop is End");

	}

}
