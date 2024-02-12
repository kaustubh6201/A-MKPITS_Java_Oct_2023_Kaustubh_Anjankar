package in.mkpits.generic;

public class NonboundedClass {

	public static void main(String[] args)
	{

		Integer[] intarr = {1,2,3,4,5,6,7,8};
		PrintData<Integer> printInteger = new PrintData<>();
		printInteger.print(intarr);
		
		String[] stringarr = { "Pranav","Vaibhav","Raju","Shyam"};
		PrintData<String> printString = new PrintData<>();
		printString.print(stringarr);
		
		Double[] doublearr = {22.6,55.1,9.5,45.3,12.3};
		PrintData<Double> printData = new PrintData<>();
		printData.print(doublearr);

	}

//	public class PrintData<T>{
//
//		public void print(T[] arr)
//		{
//		for (T val : arr) {
//			System.out.println(val);
}
