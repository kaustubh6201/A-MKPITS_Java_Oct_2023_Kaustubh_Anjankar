package in.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("D:\\NEW FILE.txt");

        BufferedReader br = new BufferedReader(fr);
        
		String data = "";
		
		while ((data = br.readLine()) != null)
		{
		
			System.out.print(data);
		}
		
		fr.close();

	}

}
