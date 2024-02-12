package in.mkpits.string;

public class StringBufferOverview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBufferOverview br = new StringBufferOverview();
		br.bufferMethod();
	}

        public void bufferMethod() {
		// TODO Auto-generated method stub
		
		 String Name = "My name is kaustubh";
		 StringBuffer obj = new StringBuffer(Name);
		 
		 String newName = "Last name is Anjankar";
		 StringBuffer sbj = new StringBuffer(newName);
		 
		//string buffer with no characters in it and an initial capacity of 16 characters. obj = obj.append(" \t "); // is type se bhi method used kr skte hai
		 System.out.println(obj);        // agar dusre line me used krna hai to '\tab' used kre
		 
		// obj = obj.delete(3, 5);  // starting pt include end pt not include
		 System.out.println(obj);
		
		// System.out.println(sbj.deleteCharAt(5));    //direct syso krke method used kr skte hai 
		 
		// System.out.println("The capacity is:- "+obj.capacity());
		 //string buffer with no characters in it and an initial capacity of 16 characters
		 
		 //System.out.println(sbj.codePointAt(3));
		 //count kro fr uska ascii value check kro alphabet ka 
		 
		// System.out.println(sbj.reverse());
		 
		 System.out.println(sbj.replace(2, 5, newName));
		 
		 System.out.println(obj.indexOf("k"));
		 
		 System.out.println(obj.insert(4, 5));
		 //it means (4)fourth point vr nxt int value prnt krte
		 
		 System.out.println(obj.offsetByCodePoints(9, 2));
		 
		 System.out.println(obj.lastIndexOf(Name));
		 
			 
		 
	}

}
