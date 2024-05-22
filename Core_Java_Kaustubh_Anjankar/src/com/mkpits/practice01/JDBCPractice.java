package com.mkpits.practice01;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCPractice {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_student_tracker","root","");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+ rs.getString(2)+rs.getString(3)+rs.getString(4));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
