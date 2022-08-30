<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>User Registration Form</h1>
	<form action="registeruser" method="get">
		<pre>
			Id: <input type="text" name="id"/>
			Name: <input type="text" name="name"/>
			Email: <input type="text" name="email"/>
			<input type="submit" value="Register"/>
		</pre>
	</form>
</body>
</html>