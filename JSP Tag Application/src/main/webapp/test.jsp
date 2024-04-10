<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Document</title>
</head>
<body>
    <c:set var="stuff" value="<%= new java.util.Date() %>" />
    The Time on the Server is ${stuff} 
</body>
</html>