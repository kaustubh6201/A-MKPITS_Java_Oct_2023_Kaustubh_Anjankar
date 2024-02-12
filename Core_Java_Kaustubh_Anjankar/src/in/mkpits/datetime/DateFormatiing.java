package in.mkpits.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatiing {

	public static void main(String[] args)
	{
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Before Formatting "+obj);
		
		//of.pattern is used to set the format
		DateTimeFormatter formatobj = DateTimeFormatter.ofPattern ("dd/MM/yyyy ;HH:mm:ss");
		String dtformater = obj.format(formatobj);
		System.out.println("After Formatting " +dtformater);
				

	}

}
    