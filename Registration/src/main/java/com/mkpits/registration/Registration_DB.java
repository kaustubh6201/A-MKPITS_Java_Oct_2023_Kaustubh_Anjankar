package com.mkpits.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class Registration_DB {

	private DataSource dataSource;

	public Registration_DB(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource=dataSource;
	}

	public void addData(Registration_Model registerData) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();

						// create sql for insert
						String sql = "insert into login_register(name,email,gender,city,mobile_no,password) values(?,?,?,?,?,?)";
						myStmt = myConn.prepareStatement(sql);

						// set the param values for the student
						myStmt.setString(1, registerData.getName());
						myStmt.setString(2, registerData.getEmail());
						myStmt.setString(3, registerData.getGender());
						myStmt.setString(4, registerData.getCity());
						myStmt.setLong(5, registerData.getMobile_no());
						myStmt.setString(6, registerData.getPassword());
						


						// execute SQL insert
						myStmt.execute();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						close(myConn, myStmt, null);
					}		
	}

	private void close(Connection myConn, PreparedStatement myStmt, Object object) {
		try {
			Connection myRs = null;
			if(myRs != null) {
				myRs.close();
			}if(myStmt != null) {
				myStmt.close();
			}
			if(myConn != null) {
				myConn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
