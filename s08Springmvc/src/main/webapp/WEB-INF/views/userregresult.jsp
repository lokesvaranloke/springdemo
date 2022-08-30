<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Result</title>
</head>
<body>
	<h3>User Registered Successfully</h3>
	<p> User Details are : <%= request.getAttribute("userfromcontroller") %></p>
</body>
</html>