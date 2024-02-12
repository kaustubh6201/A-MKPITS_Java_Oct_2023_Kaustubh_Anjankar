package in.mkpits.basic;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		
     
      System.out.println("FirstName");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String fname = br.readLine();
      //System.out.println(fname);
      
      System.out.println("LastName");
      BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));
      String lname = ar.readLine();
     // System.out.println(lname);
      
		System.out.println("MobileNumber");
		BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
		long Mnum =Long.parseLong(num.readLine());
		
		System.out.println("pincode");
		BufferedReader pin = new BufferedReader(new InputStreamReader(System.in));
		long code = Long.parseLong(pin.readLine());
		
		System.out.println("gender");
		BufferedReader tr = new BufferedReader(new InputStreamReader(System.in));
		String gname = tr.readLine();
		
		System.out.println("email");
		BufferedReader er = new BufferedReader(new InputStreamReader(System.in));
		String ename = er.readLine();
		
		
		System.out.println("End");
		BufferedReader lst = new BufferedReader(new InputStreamReader(System.in));
		String last = lst.readLine();
		

			

	}

}
