package com.mkpits.booksrecord;

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
 * Servlet implementation class BookList_Controller
 */
@WebServlet("/BooksListController")
public class BooksListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BooksDb booksdb;
	
	@Resource(name = "jdbc/web_student_tracker")
	 private DataSource dataSource;
	
	@Override
		public void init() throws ServletException {
		
			super.init();
	       try {
	    	   booksdb = new BooksDb(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			//booksList(request,response);
			String theCommand = request.getParameter("command");
			if(theCommand==null) {
				theCommand="LIST";
			}	
		
		switch (theCommand) {
		case "LIST":bookslist(request, response);
			
			break;
			case "ADD":
				addbooks(request,response);
				break;
			case "LOAD":
				loadbooks(request,response);
				break;

			case "UPDATE":
				updatebooks(request,response);
				break;
			case "DELETE":
				deletebooks(request,response);
				break;
		default:
			bookslist(request, response);
		}
		}
		catch (Exception e) {
			throw new ServletException(e);
		 }
			
		}
	

	private void deletebooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String bookId = request.getParameter("booksid");
		
		//delete student from database
		booksdb.deletebooks(bookId);
		
		//send back to again "list-student.jsp"
		bookslist(request,response);
		
	}

	private void updatebooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String bookid = request.getParameter("booksid");
		int id = Integer.parseInt(bookid);

		// read student data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");

		// create a new student object
		Books_Model thebook = new Books_Model(id, title, author, date, genres, characters, synopsis);

		// perform update on database
		booksdb.updatebooks(thebook);

		// send them back to the list "list-students" page
		bookslist(request,response);
		
	}

	private void loadbooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read student id from form data
		String thebook = request.getParameter("booksid");

		// get student from database (dbutility)
		Books_Model thebooks =booksdb.loadbooks(thebook);

		// place student in the request attribute
		request.setAttribute("THE_STUDENT", thebooks);

		// send to JSP page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/bookslist.jsp");
		dispatcher.forward(request, response);
		
	}

	private void addbooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");
		
		//create new Student_Model object
		
		Books_Model thebooks=new Books_Model(title, author, date, genres, characters, synopsis);
		//add student to the database
		booksdb.addbooks(thebooks);
		
		//send back to the main page(the Student list)
		bookslist(request, response);
		
	}

	private void bookslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Books_Model> books = booksdb.getList();
		
		
		
		request.setAttribute("BOOKS_LIST", books);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/books_list.jsp");
		dispatcher.forward(request, response);
		
		
	}

}