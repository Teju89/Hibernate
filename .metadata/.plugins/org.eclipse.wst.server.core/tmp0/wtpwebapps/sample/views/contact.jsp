<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
form {
	width: 50%;
	border: 10px solid black;
	padding: 10px;
}

input {
	font-size: 60px;
	text-align: center;
	padding: 20px;
}
</style>
</head>
<body>
	<form action="register" method="post">
		<center>
			<center><h1><%= request.getAttribute("msg")%></h1></center>
			<input placeholder="Enter Roll No" name="rollNo"> <br> <br> 
			<input placeholder="Enter Name" name="name"> <br> <br> 
			<input placeholder="Enter City" name="city"> <br> <br> 
			<input type="submit" value="Register">
		</center>
	</form>
</body>
</html>