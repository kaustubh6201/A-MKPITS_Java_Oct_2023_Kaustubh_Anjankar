package in.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIPStream {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\Login.txt");
		int b = 0;
		while((b = fis.read()) !=-1) //read the byte one by one 
		{
			System.out.print((char)b);
			
		}
        fis.close();
		
	}

}
