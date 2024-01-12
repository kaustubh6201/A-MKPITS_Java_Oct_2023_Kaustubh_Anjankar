package in.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOPStream {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Data to be Written");
		String obj = br.readLine();
		
		obj = obj + "\n";
		
		FileOutputStream fos = new FileOutputStream("D:\\Login.txt",true);
		byte b[] = obj.getBytes(); // to get the byte line by line 
		fos.write(b);
		fos.close();
		System.out.println("The data is written");
		

	}

}
