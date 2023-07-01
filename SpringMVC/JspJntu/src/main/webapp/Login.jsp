<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
	input
	{
		font-size : 30px;
		font-family : cursive;
		text-align : center;
		padding : 20px;
	}
	form
	{
		border : 10px solid black;
	}
	h1
	{
		font-size : 40px;
		text-decoration : underline double;
		font-family : Monospace;
	}
	</style>
	<center>
			<h1><%= request.getAttribute("output")%></h1>
			<hr>
			<hr>
			<form>
				<input type="email" placeholder="EMAIL">
				<br><br>
				<input type="password" placeholder="Password">
				<br><br>
				<input type="submit" value="Login">
			</form>
	</center>
</body>
</html>