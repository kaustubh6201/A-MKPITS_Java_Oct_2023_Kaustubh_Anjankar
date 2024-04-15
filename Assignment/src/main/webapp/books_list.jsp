<%@page import="com.mkpits.booksrecord.Books_Model"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="CSS/style.css">
</head>
<%
//get the student the RequestDispatcher
List<Books_Model> books = (List<Books_Model>) request.getAttribute("BOOKS_LIST");
%>
<body>

   <div id="wrapper">
		<div id="header">
			<h2>BOOKS RECORD</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		
			<table border="1">
				<tr>

					<th>ID</th>
					<th>TITLE</th>
					<th>AUTHOR</th>
					<th>DATE</th>
					<th>GENRES</th>
					<th>CHARACTERS</th>
					<th>SYNOPSIS</th>
					<th>Action</th>

				</tr>

				<c:forEach var="tempbook" items="${BOOKS_LIST}">
				  <!--  Set up link for each student -->
    <c:url var="tempLink"  value="BooksListController">
    <c:param  name="command" value="LOAD" /> 
    <c:param  name="studentId" value="${tempbook.id}" /> 
    </c:url>
    
    <!--  Set up link for each student -->
    <c:url var="deleteLink"  value="BooksListController">
    <c:param  name="command" value="DELETE" /> 
    <c:param  name="booksId" value="${tempbook.id}" /> 
    </c:url>
				
				
					<tr>
						<td>${tempbook.id}</td>
						<td>${tempbook.title}</td>
						<td>${tempbook.author}</td>
						<td>${tempbook.date}</td>
						<td>${tempbook.genres}</td>
						<td>${tempbook.characters}</td>
						<td>${tempbook.synopsis}</td>
						<!-- out.println(BOOKS_LIST); -->
						    <td><input type="button" value="Add" onclick="window.location.href='add_book_list.jsp'; return false;"
		 class="add_student_button"><br><br>
						    <a href="${tempLink}">Update</a><br><br>
                      <a href="${deleteLink}" onclick="if(!(confirm('Are yousure you want to destroy this row ?'))) return false">Delete</a>


					</tr>
				</c:forEach>


			</table>
		</div>
	</div>

</body>
</html>