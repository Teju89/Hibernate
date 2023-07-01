<%@page import="model.Student"%>
<%@page import="java.util.Date"%>
<%@page import="model.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h1>This is My Page</h1>
		<center><h1><%= request.getAttribute("msg")%></h1></center>
		
		<h1 style="color:blue;">Student Information</h1>
		<%
			/* Address add =  (Address)request.getAttribute("address1");
			Date date = (Date)request.getAttribute("date"); */
			/* int rn = (Integer)request.getAttribute("rollNo");
			String name = (String)request.getAttribute("name");
			String sc = (String)request.getAttribute("city"); */
			Student s1 = (Student)request.getAttribute("student");
		%>
		
		<h1>Roll No = <%= s1.getRollNo()%></h1>
		<h1>Name = <%= s1.getName()%></h1>
		<h1>City = <%= s1.getCity()%></h1>
		<center><h1><%= request.getAttribute("message")%></h1></center>
</body>
</html>



























