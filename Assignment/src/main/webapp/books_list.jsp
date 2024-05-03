<%@page import="com.mkpits.booksrecord.Books_Model"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="CSS/Style2.css">
<script>
/* 	function showmore(id) {
		var x = document.getElementById(id);
		if (x.style.display === "") {
			x.style.display = "block";
		} else {
			x.style.display = "";
		}
	} */
	function showmore(id) {
		var button = document.querySelector('button[onclick ="showmore(\'' + id
				+ '\')"]');
		var element = document.getElementById(id);

		if (element.style.display === '-webkit-box') {
			element.style.display = 'block';
			button.textContent = 'Read Less'; 
			
		} else {
			element.style.display = '-webkit-box';
			 button.textContent = 'Read More'; 
			
		}

	}
</script>
<script>
	/* for searching data */
	function search() {
		let filter = document.getElementById("myInput").value.toUpperCase();
		let myTable = document.getElementById("myTable");
		let tr = myTable.getElementsByTagName("tr");

		for (var i = 0; i < tr.length; i++) {
			let td = tr[i].querySelector(".td");

			if (td) {
				let textvalue = td.textContent || td.innerHTML;

				if (textvalue.toUpperCase().indexOf(filter) > -1) {
					tr[i].style.display = "";

				} else {
					tr[i].style.display = "none";

				}
			}
		}
	}
</script>
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
	<br>
	<div class="outer">
	
	<div class="sBtn">
	<input type="text" id="myInput" class="sInp" placeholder="Search" onkeyup="search()" >
	</div>
	<div class="pagination-header">
			<div class="pagination-button">
			<c:url var="Link1" value="BooksListController?page=1">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link2" value="BooksListController?page=2">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link3" value="BooksListController?page=3">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link4" value="BooksListController?page=4">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link5" value="BooksListController?page=5">
						<c:param name="command" value="RECORDS" />
					</c:url>
              <a href="${Link1}">1</a> 
              <a href="${Link2}">2</a>
               <a href="${Link3}">3</a>
                <a href="${Link4}">4</a>
                <a href="${Link5}">5</a>
              
			</div>
			</div>
			<div style="height: 100%;width: 300px;">
	<input type="button" value="Add Books"
		onclick="window.location.href='add_book_list.jsp'; return false;"
		id="add_books_button">
</div>
	</div>
	<div id="container">
		<div id="content">

			<table border="1" id="myTable" >
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
					<c:url var="tempLink" value="BooksListController">
						<c:param name="command" value="LOAD" />
						<c:param name="booksid" value="${tempbook.id}" />
					</c:url>

					<!--  Set up link for each student -->
					<c:url var="deleteLink" value="BooksListController">
						<c:param name="command" value="DELETE" />
						<c:param name="booksid" value="${tempbook.id}" /> 
    </c:url>


					<tr>
						<td>${tempbook.id}</td>
						<td class="td"><p id="title_${tempbook.id}">${tempbook.title}</p>
							<button id="smBtn1" type="submit" onclick="showmore('title_${tempbook.id}')">Read
								more</button></td>
						<td class="td">${tempbook.author}</td>
						<td >${tempbook.date}</td>
						<td class="td" ><p id="genres_${tempbook.id}">${tempbook.genres}</p>
							<button id="smBtn2" type="submit" onclick="showmore('genres_${tempbook.id}')">Read
								More</button></td>
						<td class="td"><p id="characters_${tempbook.id}">${tempbook.characters}</p>
							<button id="smBtn3" type="submit"
								onclick="showmore('characters_${tempbook.id}')">Read
								More</button></td>
						<td class="td"><p id="synopsis_${tempbook.id}">${tempbook.synopsis}</p>
							<button id="smBtn4" type="submit"
								onclick="showmore('synopsis_${tempbook.id}')">Read more</button></td>
						<td><a href="${tempLink}">Update</a><br> <br> <a
							href="${deleteLink}"
							onclick="if(!(confirm('Are you want to destroy this row ?'))) return false">Delete</a>
					</tr>
				</c:forEach>


			</table>
		</div>
	</div>

</body>
</html>