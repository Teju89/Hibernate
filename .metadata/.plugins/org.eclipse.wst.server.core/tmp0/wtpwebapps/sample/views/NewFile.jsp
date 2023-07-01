<%@page import="java.util.List"%>
<%@page import="model.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>It is called by controller</h1>
	<%
	String s1 = (String) request.getAttribute("name");
	Integer rn = (Integer) request.getAttribute("rollNo");
	Address addr = (Address) request.getAttribute("addr");
	List<Integer> list = (List) request.getAttribute("list");
	%>
	<h1>
		NAme =
		<%=s1%></h1>
	<h1>
		RollNo =
		<%=rn%></h1>
	<h1><%=addr%></h1>
	<%
	for (Integer i : list) {
	%>
	<h1><%=i%></h1>
	<%
	}
	%>
</body>
</html>


















