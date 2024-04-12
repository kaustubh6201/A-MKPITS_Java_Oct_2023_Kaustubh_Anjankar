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
</head>

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
					<th>GENERES</th>
					<th>CHARACTER</th>
					<th>SYNOPSIS</th>

				</tr>

				<c:forEach var="tempbook" items="${BOOKS_LIST}">
					<tr>
						<td>${tempbook.id}</td>
						<td>${tempbook.title}</td>
						<td>${tempbook.author}</td>
						<td>${tempbook.date}</td>
						<td>${tempbook.genres}</td>
						<td>${tempbook.characters}</td>
						<td>${tempbook.synopsis}</td>

					</tr>


				</c:forEach>

			</table>
		</div>
	</div>

</body>
</html>