package in.mkpits.basic;

public class StaticMethod {
     static int person  = 2245;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		getuser();
		getclass();
		getData();
	}
	
	public static void getData() {
		String fName= "Kaustubh";
		System.out.println("first name is "+fName);
	}

	public static void getName() {
		String lName= "Anjankar";
		System.out.println("my name is "+lName);
	}
	
	public static void getuser() {
		String uName = "laptop";
		System.out.println("the user is "+uName);
				
	}
	public static void getclass() {
		String cName= "MKPT";
		System.out.println("class name is"+cName);
	}
	}
