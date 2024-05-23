package com.mkpits.practice01;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(101, "Kaustubh"));
		emp.add(new Employee(102, "Raj"));
		emp.add(new Employee(103, "Pranav"));
		emp.add(new Employee(104, "Harsh"));
		
		System.out.println(emp);

		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}

}
