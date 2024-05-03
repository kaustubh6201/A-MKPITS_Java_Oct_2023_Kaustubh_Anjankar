package com.mkpits.registration;

public class Registration_Model {
	private int id;
	private String name;
	private String email;
	private String gender;
	private String city;
	private long mobile_no;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Registration_Model(int id, String name, String email, String gender, String city, long mobile_no,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.mobile_no = mobile_no;
		this.password = password;
	}
	public Registration_Model(String name, String email, String gender, String city, long mobile_no, String password) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.city = city;
		this.mobile_no = mobile_no;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration_Model [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", city="
				+ city + ", mobile_no=" + mobile_no + ", password=" + password + "]";
	}
		
}