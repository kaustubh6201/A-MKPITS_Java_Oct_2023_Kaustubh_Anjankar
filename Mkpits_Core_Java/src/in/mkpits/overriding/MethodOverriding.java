package in.mkpits.overriding;

public class MethodOverriding {

	public static void main(String[] args) 
	{
		Square obj;
		obj = new Square();
		
		obj.getdata(5, 8);
		obj.getarea();
		
		obj = new Retangle();
		obj.getdata(5, 8);

		obj.getarea();
		
		
		

	}

}
