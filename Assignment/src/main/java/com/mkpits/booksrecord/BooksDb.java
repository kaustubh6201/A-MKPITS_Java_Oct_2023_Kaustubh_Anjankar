package com.mkpits.booksrecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import com.mkpits.booksrecord.Books_Model;



public class BooksDb {
	private  DataSource dataSource;
	
	public BooksDb(DataSource dataSource) {
		
		this.dataSource = dataSource;
		
	}
	
	public List<Books_Model> getList() throws Exception 
	{
		List<Books_Model> books = new ArrayList<Books_Model>();
		
		Connection connection = null;
		Statement statement = null ;
		ResultSet result = null;
		
		try {
			connection = dataSource.getConnection();
			
			String sql = "select * from books order by id";
			statement = connection.createStatement();
			result = statement.executeQuery(sql);
			
			while (result.next())
			{
				int id = result.getInt("id");
				String title = result.getString("title");
				String author = result.getString("author");
				String date = result.getString("date");
				String genres = result.getString("genres");
				String characters = result.getString("characters");
				String synopsis = result.getString("synopsis");
				//System.out.println(id);
				
			 
				Books_Model tempbook = new Books_Model(id,title,author,date,genres,characters,synopsis);
				 
				books.add(tempbook);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(connection, statement,result);
			
		}
		return books;
		
		
	}

	private void close(Connection connection, Statement statement, ResultSet result) {
		
		try {
			if(result !=null) {
				result.close();
			}
			if(statement !=null) {
				statement.close();
			}
			if(connection !=null) {
				connection.close();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void addbooks(Books_Model thebooks) {
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			//get db connection
			connection=dataSource.getConnection();
			
			//create sql for insert
			String sql="insert into books(title,author,date,genres,characters,synopsis)values(?,?,?,?,?,?)";
			statement=connection.prepareStatement(sql);
			
			//set the parameter value
			statement.setString(1,thebooks.getTitle());
			statement.setString(2,thebooks.getAuthor());
			statement.setString(3,thebooks.getDate());
			statement.setString(4,thebooks.getGenres());
			statement.setString(5,thebooks.getCharacters());
			statement.setString(6,thebooks.getSynopsis());
			
			//execute sql insert
			statement.execute();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			close(connection, statement,null);
		}
		
	}
	
	
	public  Books_Model loadbooks(String thebook) {
		Books_Model thebooks = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		int booksid;

		try {
			// convert student id into integer
			booksid = Integer.parseInt(thebook);

			// get database connection
			connection = dataSource.getConnection();

			// create sql to get selected student
			String sql = "select * from student where id = ?";

			// create a prepared statement
			statement = connection.prepareStatement(sql);

			// set params
			statement.setInt(1, booksid);

			// execute statement
			result = statement.executeQuery();

			// retrive data from result set row
			if (result.next()) {
				String title = result.getString("title");
				String author = result.getString("author");
				String date = result.getString("date");
				String genres = result.getString("genres");
				String characters = result.getString("characters");
				String synopsis = result.getString("synopsis");
				

				// use the studentid during construction
				thebooks = new Books_Model(booksid, sql, sql, sql, sql, thebook, sql);
			} else {
				throw new Exception("Could not find booksid " + booksid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(connection, statement, result);
		}

		return thebooks;
		
	}


	public  void updatebooks(Books_Model thebook) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		try {

			// get db connection

			connection = dataSource.getConnection();

			// create sql to get update student
			String sql = "update student set first_name = ?,last_name = ?,email = ? where id = ?";

			// create a prepared statement
			statement = connection.prepareStatement(sql);

			// set params
			statement.setString(1, thebook.getTitle());
			statement.setString(2, thebook.getAuthor());
			statement.setString(3, thebook.getDate());
			statement.setString(4, thebook.getGenres());
			statement.setString(5, thebook.getCharacters());
			statement.setString(6, thebook.getSynopsis());
			statement.setInt(7, thebook.getId());
			

			// execute SQL statement
			statement.execute();

		} finally {
			close(connection, statement,null);
		}
	}
	
	public  void deletebooks(String bookId) throws Exception {

		{
			Connection connection = null;
			PreparedStatement statement = null;
			try {
				// convert student to integer
				int theStudentId = Integer.parseInt(bookId);

				// get db connection

				connection = dataSource.getConnection();

				// create sql to get update student
				String sql = "delete from books where id = ?";

				// create a prepared statement
				statement = connection.prepareStatement(sql);
				
				//set params
				statement.setInt(1, theStudentId);
				
				//execute sql
				statement.execute();
			} finally {
				close(connection, statement,null);
			}

		}
		
		
	}



}


