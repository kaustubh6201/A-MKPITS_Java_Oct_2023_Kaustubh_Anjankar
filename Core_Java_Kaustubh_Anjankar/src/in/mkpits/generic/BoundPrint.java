package in.mkpits.generic;

public class BoundPrint<F extends Number >{


	public void print(F[] arr)
	{
	for (F obj : arr) {
		System.out.println(obj);
	}
	}
}
