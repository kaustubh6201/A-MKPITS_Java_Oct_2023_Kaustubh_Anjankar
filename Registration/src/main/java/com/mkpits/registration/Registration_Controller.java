package com.mkpits.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.mkpits.registration.Registration_DB;

/**
 * Servlet implementation class Regestration_Controller
 */
@WebServlet("/Registration_Controller")
public class Registration_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private Registration_DB register;
	@Resource(name = "jdbc/registration")
	private DataSource dataSource;
	

	public void init() throws ServletException {
		super.init();
		// create student db util ..and pass int the conn pool / dataSource
		try {
			register = new Registration_DB(dataSource);
		} catch (Exception exe) {
			throw new ServletException(exe);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		addData(request,response);

}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		//for login
		
				try {
					PrintWriter out=response.getWriter();
					response.setContentType("text/html");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
					String n=request.getParameter("email").trim();
					String p=request.getParameter("password");
					PreparedStatement ps=conn.prepareStatement("select email from login_register where email=? and password=?");
					ps.setString(1, n);
					ps.setString(2, p);
					ResultSet rs= ps.executeQuery();
					if(rs.next()) {
						
						RequestDispatcher rd=request.getRequestDispatcher("homepage.html");
						rd.forward(request, response);}
					else
					{
//						RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
//						rd.forward(request, response);
//						
						out.println("Login Failed");
					}
				} catch (ClassNotFoundException e) {
				
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		


	
	
	
	private void addData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		Long mobile_no = Long.parseLong(request.getParameter("mobile_no"));
		String password = request.getParameter("password");
	

		// create new Student_Model object

		Registration_Model registerData = new Registration_Model(name, email, gender, city, mobile_no, password);
		// add student to the database
		register.addData(registerData);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/homepage.jsp");
		dispatcher.forward(request, response);		
	}
}
