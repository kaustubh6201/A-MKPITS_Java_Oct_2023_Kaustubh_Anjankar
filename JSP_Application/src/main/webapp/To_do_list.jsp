<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To Do List</title>
</head>
<body>
<form action="To_do_list.jsp" method="post">
      Add item : <input type="text" name="todo" id="" /> <br>
      <input type="submit" value="submit"/>
      <br><br>
      Item Entered : <%= request.getParameter("todo") %>

    </form>
    
    <%
    List<String> item = (List<String>)session.getAttribute("mytodolist");
    if (item==null)
    {
    	
    	item=new ArrayList<String>();
    	session.setAttribute("mytodolist", item);
    	
    	String theitem=request.getParameter("todo");
    	if ((theitem !=null)&&(!theitem.trim().equals("")))
    	{
    		item.add(theitem);
    	}
    	
    }
    %>
    
    <hr>
    <strong>To Do List Items Are</strong>
    <ol>
    <%
    for (String temp : item)
    {
    	out.println("<li"+temp+"</li>");
    }
    %>
    </ol>
</body>
</html>