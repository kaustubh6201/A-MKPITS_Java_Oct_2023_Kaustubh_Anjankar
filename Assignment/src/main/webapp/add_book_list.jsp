<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="CSS/add-book-style.css">
<!-- <link type="text/css" rel="stylesheet" href="CSS/addbutton.css" > -->
</head>
<body>

   <div id="wrapper">
		<div id="header">
			
		</div>
	</div>
	<div id="container">
	<!-- <h2>Search</h2> -->
	<h3>Add Books</h3></div>   
	<form action="BooksListController" method="get">
	<input type="hidden" name="command" value="ADD"/>
	<table>
	<tbody>
	<tr><td><label>Title</label></td>
	<td><input type="text" required="required" name="title"/></td></tr>
	<tr><td><label>Author</label></td>
	<td><input type="text" required="required" name="author"/></td></tr>
	<tr><td><label>Date</label></td>
	<td><input type="text" required="required" name="date"/></td></tr>
	<tr><td><label>Genres</label></td>
	<td><input type="text" required="required" name="genres"/></td></tr>
	<tr><td><label>Characters</label></td>
	<td><input type="text" required="required" name="characters"/></td></tr>
	<tr><td><label>Synopsis</label></td>
	<td><input type="text" required="required" name="synopsis"/></td></tr>
	
	
	<tr><td><button type="submit" value="Save" class="save">Save</button>
	</tbody></table></form>
	<div style="clear:both;"></div>
	<p><a href="BooksListController">Back To List</a></p>

</body>
</html>