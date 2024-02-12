package in.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterClass {

	public static void main(String[] args) throws IOException
	{
	
		PrintWriter pw = new PrintWriter(System.out, false);
		pw.println(" Enter the Data ");
		pw.close();
		
//		pw.flush();
		
		PrintWriter obj = new PrintWriter(new FileWriter("D:\\File.txt",true),true);
		obj.println("Hello Friends");
		obj.close();
	}

}
