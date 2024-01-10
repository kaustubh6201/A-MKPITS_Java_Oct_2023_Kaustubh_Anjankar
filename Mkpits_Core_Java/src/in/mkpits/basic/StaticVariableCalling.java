 package in.mkpits.basic;

public class StaticVariableCalling {
	static int a=45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2. ClassName.variableName
		System.out.println("The Price is "+StaticVariable.price);
		
		// 3. objectRef.variableName
		StaticVariable variable = new StaticVariable();
		System.out.println("The Price Is "+ variable.price);
		
 		StaticVariable variable2 = new StaticVariable();
 				System.out.println("the price "+ variable.price);
 				StaticVariableCalling obj = new StaticVariableCalling();
 				System.out.println(""+obj.a);

		
	}

}
