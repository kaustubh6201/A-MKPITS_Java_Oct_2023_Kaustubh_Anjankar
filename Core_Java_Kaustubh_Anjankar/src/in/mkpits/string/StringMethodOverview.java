package in.mkpits.string;

public class StringMethodOverview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String fName = "Kaustubh";
		String lName = "Anjankar";
		
		//System.out.println(fName.toString());
		//System.out.println(fName.charAt(4));
		
		//System.out.println(String.join("#",lName,fName));
		String newName = String.join("@",lName, fName);
		System.out.println(newName);
		
		System.out.println(fName.endsWith("h"));
		
		System.out.println(lName.startsWith("j"));
		
		System.out.println(fName.replace('a', 'u'));
		
		System.out.println(fName.replaceAll("Anjankar", fName));
		
		System.out.println(lName.equals(fName));
		
		System.out.println(lName.concat(fName));
		
		System.out.println(fName.equalsIgnoreCase(lName));
		
		System.out.println(lName.indexOf(3));
		
		System.out.println(fName.toLowerCase());
		
		System.out.println(lName.toUpperCase());
		
		System.out.println(fName.repeat(2));
		
		
		
		
		
		byte[]b = {65,66,67,68,50};
		char ch []= {'x','y','z','2','1',};
		
		String s1 = new String();
		System.out.println("S1 = ");
		
		String s2 = new String(b);
		System.out.println(s1);
		
		String s3 = new String(b,0,3);
		System.out.println(s3);
		String s4 = new String(ch,1,2);
		System.out.println(s4);
		
	}

}
