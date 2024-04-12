package com.mkpits.booksrecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;



public class BooksDb {
	private DataSource datasource;
	
	public BooksDb(DataSource dataSource) {
		
		this.datasource = dataSource;
		
	}
	
	public List<Books_Model> getList() throws Exception 
	{
		List<Books_Model> books = new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null ;
		ResultSet result = null;
		
		try {
			connection = datasource.getConnection();
			
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
				
			 
				Books_Model tempStudent = new Books_Model(id,title,author,date,genres,characters,synopsis);
				 
				books.add(tempStudent);
				
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

}


