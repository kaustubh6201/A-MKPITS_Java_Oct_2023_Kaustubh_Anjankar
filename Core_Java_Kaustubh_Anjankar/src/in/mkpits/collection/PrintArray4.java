package in.mkpits.collection;

public class PrintArray4<T>{
	
	public void print(T[] test)
	{
		for (T t : test) {
			System.out.println(t);
			
		}

	}
	public static void main(String[] args) 
	{
		Integer[] intarr = {22,51,64,86,52,93};
		String[] strarr = {"Kaustubh","Raj","Pranav","Ashik"};
		
		PrintArray4<Integer> class1 = new PrintArray4<>();
		class1.print(intarr);
		
		PrintArray4<String> class2 = new PrintArray4<>();
		class2.print(strarr);
	
	}

}
