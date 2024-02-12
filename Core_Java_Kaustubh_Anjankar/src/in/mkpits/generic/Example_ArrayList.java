package in.mkpits.generic;

import java.util.ArrayList;

public class Example_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Student> sl = new ArrayList<Student>();
		
		sl.add(new Student("Kaustubh", 21));
		sl.add(new Student("Pranav", 22));
		sl.add(new Student("Ashik", 23));
		sl.add(new Student("Raj", 24));
		
		ArrayList<Student> sl1 = new ArrayList<Student>();
		
		sl1.add(new Student("Kaustubh", 21));
		sl1.add(new Student("Vinay", 25));
		sl1.add(new Student("Regved", 26));
		sl1.add(new Student("Harsh", 27));
		
		sl.addAll(sl1);
		for (Student student : sl)
		{
			System.out.println(student);
		}
		
		System.out.println("---------------");
		
//		sl.removeAll(sl1);
//		for (Student student : sl1) {
//			System.out.println(student);
//		}
		
//		System.out.println("---------------");
		
		sl.retainAll(sl1);
		for (Student student : sl1)
		{
		System.out.println(student);	
		}
		
		System.out.println("---------------");

	}

}
