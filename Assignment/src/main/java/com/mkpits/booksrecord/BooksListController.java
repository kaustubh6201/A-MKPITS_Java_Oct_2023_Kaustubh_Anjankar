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
@WebServlet("/BookListController")
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
			booksList(request,response);
		}
		
		 catch (Exception e) {
			throw new ServletException(e);
		 }
			
		}

	private void booksList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Books_Model> books = booksdb.getList();
		System.out.println(books.toString());
		
		
		request.setAttribute("BOOKS_LIST", books);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/books_list.jsp");
		dispatcher.forward(request, response);
		
	}

}