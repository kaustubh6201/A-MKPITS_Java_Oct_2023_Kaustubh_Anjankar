package in.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Data :-");
		String str = br.readLine();
		
		str = str + "\n";
		FileWriter obj = new FileWriter("D:\\NEW FILE.txt");
		obj.write(str);
		obj.close();
		
		System.out.println("Data has been Saved");
				

	}

}
