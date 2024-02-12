package in.mkpits.basic;

public class MethodPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getaccount();
		getemail();
		getpassword();
		getaccno();
		boyscount();
		
		MethodPractise methodPractise = new MethodPractise();
		methodPractise.createAccount();
		methodPractise.kaustubh();
		MethodPractise.getDetails();
	
		
	}

	private void kaustubh() {
		// TODO Auto-generated method stub
		
	}

	private static void getDetails() {
		// TODO Auto-generated method stub
		
	}

	public void createAccount() {
		// TODO Auto-generated method stub
		
		System.out.println("account create ");
	}

	public static void getaccount() {
		String aName= "facebook";
		System.out.println("account name "+aName);
	}
	
	public static void getemail() {
		float eName = 22.32f;
		System.out.println("the email is"+ eName);
	}
	
	public static void getpassword() {
		int pName = 2001;
		System.out.println("email password is"+ pName);
	}
	
	public static void getaccno() {
		short aName = 5277;
		System.out.println("the bank name is "+aName);
	}
	
	public static void boyscount() {
	long bName = 5061151160l;
	System.out.println("the boys conut is "+bName);
	}
	
	
	
}
