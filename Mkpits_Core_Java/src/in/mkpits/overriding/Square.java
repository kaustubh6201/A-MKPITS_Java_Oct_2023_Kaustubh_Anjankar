package in.mkpits.overriding;

public class Square 
{

	int l,h;
	public void getdata(int l,int h) 
	{
		this.l = l;
		this.h = h;
	}
		
		public void getarea() 
		{
			
		int area = l*h ;
		System.out.println("Area of Square is"+area);
			
		}
		
}
