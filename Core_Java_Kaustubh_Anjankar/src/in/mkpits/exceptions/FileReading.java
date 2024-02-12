package in.mkpits.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	static FileReader obj;
	public static void main(String[] args) 
	{
		try {
			obj = new FileReader("D:\\Kaustubh.txt");
			BufferedReader br = new BufferedReader(obj);
			String  data = "";
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {obj.close();
		System.out.println("--The END--");
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
