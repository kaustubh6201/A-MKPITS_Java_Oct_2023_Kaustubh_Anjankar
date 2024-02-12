package in.mkpits.basic;

public class StaticPractice {
 
	static float petrol = 90.22f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable kaustubh = new StaticVariable();
		System.out.println(""+ kaustubh.price);
		
		int a = 5454;
		String k = "kaustubh";
		
		System.out.println("The Name is"+k);
	
		System.out.println(""+petrol);
		
		StaticPractice obj = new StaticPractice();
		System.out.println(""+obj.petrol);
		
		StaticVariableCalling word = new StaticVariableCalling();
		System.out.println(""+word.a);
		
	}


	
	
}
