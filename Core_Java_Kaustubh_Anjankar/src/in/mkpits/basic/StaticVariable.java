package in.mkpits.basic;

public class StaticVariable {

	static int price = 88255;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price=458;
		//1.direct access
		System.out.println("The Price of the Product is "+price);
		System.out.println("The Bottle Price is "+StaticVariable.price);
		
	}

}
