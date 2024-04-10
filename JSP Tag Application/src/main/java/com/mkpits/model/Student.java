package com.mkpits.model;

public class Student {
	private String firstName;
	private String lastName;
	private boolean isgoldCustomer;
	public Student(String firstName, String lastName, boolean isgoldCustomer) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isgoldCustomer = isgoldCustomer;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isIsgoldCustomer() {
		return isgoldCustomer;
	}
	public void setIsgoldCustomer(boolean isgoldCustomer) {
		this.isgoldCustomer = isgoldCustomer;
	}
	
	

}
