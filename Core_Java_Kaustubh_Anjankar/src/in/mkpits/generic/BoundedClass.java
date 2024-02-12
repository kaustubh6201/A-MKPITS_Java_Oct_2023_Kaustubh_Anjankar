package in.mkpits.generic;

public class BoundedClass {

	public static void main(String[] args)
	{
		Integer[] intarr = {1,2,3,4,5,6,7,8};
		BoundPrint<Integer> printInteger = new BoundPrint<>();
		printInteger.print(intarr);
		System.out.println("-------------------------");
		
		Double[] doublearr = {22.6,55.1,9.5,45.3,12.3};
		BoundPrint<Double> printData = new BoundPrint<>();
		printData.print(doublearr);
		System.out.println("-------------------------");
		
		// in bounded type only mention category allowed 
		// for example- < f extends Number>
		
//		String[] stringarr = { "Pranav","Vaibhav","Raju","Shyaam"};
//		BoundPrint<String> printString = new BoundPrint<>();
//		printString.print(stringarr);
	}

}
