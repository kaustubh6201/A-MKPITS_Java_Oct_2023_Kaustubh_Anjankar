package in.mkpits.generic;

public class PrintData<T>{

	public void print(T[] arr)
	{
	for (T val : arr) {
		System.out.println(val);
	}
	}
}
