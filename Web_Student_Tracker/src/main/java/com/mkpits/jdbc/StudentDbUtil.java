package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Result;

public class StudentDbUtil {
	private DataSource datasource;
	
	public StudentDbUtil(DataSource dataSource) {
		
		this.datasource = dataSource;
		
	}
	
	public List<Student> getStudents() throws Exception {
		List<Student> student = new ArrayList<>();
		
		Connection myConn = null;
		Statement mystmt = null ;
		ResultSet myRs = null;
		
		try {
			myConn = datasource.getConnection();
			
			//create a sql statment 
			String sql = "select * from student order by last_name";
			mystmt = myConn.createStatement();
			
			//execute sql query 
			myRs = mystmt.executeQuery(sql);
			
			//process the result set 
			while (myRs.next());
			{
				//retrive data from ressult set
				int id=myRs.getInt("id");
				String firstName = myRs.getString("firstName");
				String lastName = myRs.getString("lastName");
				String email = myRs.getString("email");
				
				//create Student object 
				Student tempStudent = new Student(id,firstName,lastName,email);
				
				//add it to it to the list of student 
				student.add(tempStudent);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(myConn, mystmt,myRs);
			
		}
		return student;
		
		
	}

	private void close(Connection myConn, Statement mystmt, ResultSet myRs) {
		
		try {
			if(myRs !=null) {
				myRs.close();
			}
			if(mystmt !=null) {
				mystmt.close();
			}
			if(myConn !=null) {
				myConn.close();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
