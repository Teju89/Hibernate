<html>
<body>
	<center>
		<style>
td {
	font-size: 30px;
	font-family: cursive;
	padding: 30px;
}
input {
	font-size: 30px;
	font-family: cursive;
	text-align: center;
	padding: 20px;
}
table {
	border: 10px solid black;
}
h2 {
	font-size: 40px;
	text-decoration: underline double;
	font-family: Monospace;
}
</style>
		<h2>Registration</h2>
		<form action="register">
			<table>
				<tr>
					<td>Enter Full Name</td>
					<td><input name="fn"></td>
				</tr>
				<tr>
					<td>Enter Mobile</td>
					<td><input type="number" name="mob"></td>
				</tr>
				<tr>
					<td>Enter Email</td>
					<td><input type="email" name="mail"></td>
				</tr>
				<tr>
					<td>Enter Password</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
