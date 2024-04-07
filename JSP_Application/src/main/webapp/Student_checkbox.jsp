<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
Your Name is :${param.fname } ${param.lname }<br><br>

Country : ${param.country }<br><br>
Language : ${param.favlanguage }<br><br>
Hobbies are : 
<ul>

<%
String[] hobbies = request.getParameterValues("hobbies");
for (String temp : hobbies){
	out.println("<li>" + temp + "</li>");
}
%>
</ul>
</body>
</html>