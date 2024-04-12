package com.mkpits.jdbc1;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServletNew")
public class StudentControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private StudentDbUtility studentDbUtil;
       
       @Resource(name = "jdbc/web_student_tracker")
       private DataSource dataSource;
       
      @Override
    	public void init() throws ServletException {
    		
    		super.init();
    		//create our student db util ....and pass in the conn pool / datasource
    		
    		try {
    			studentDbUtil = new StudentDbUtility(dataSource);
			} catch (Exception exc) {
				throw new ServletException(exc);
				
			}
    	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String theCommand = request.getParameter("command");
			
			if(theCommand==null) {
				theCommand="LIST";
			}
			
			switch (theCommand) {
			case "LIST":listStudents(request, response);
				
				break;
				case "ADD":
					addstudent(request,response);
					break;

			default:
				listStudents(request, response);		
			}
			
			listStudents(request,response);
		} catch (Exception e) {
			throw new ServletException();
			
		}
	   
		
	}

	private void addstudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//read student data form
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		
		//create new Student_Model object
		
		Student_model theStudent=new Student_model(firstName, lastName, email);
		//add student to the database
		studentDbUtil.addStudent(theStudent);
		
		//send back to the main page(the Student list)
		listStudents(request, response);
		
		
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//get student from db util 
		List<Student_model> student = studentDbUtil.getStudents();
		System.out.println(student.toString());
		
		//add student to the request 
		request.setAttribute("STUDENT_LIST", student);
		
		///send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list_student_button.jsp");
		dispatcher.forward(request, response);
		
	}

}
