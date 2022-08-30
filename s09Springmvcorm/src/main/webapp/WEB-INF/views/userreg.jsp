<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>User Registration Form</h1>
	<form action="registeruser" method="post">
		<pre>
			<!-- Id: <input type="text" name="id"/> -->
			Name: <input type="text" name="name"/>
			Email: <input type="text" name="email"/>
			<input type="submit" value="Register"/>
		</pre>
	</form>
	
	<p><%= request.getAttribute("result") %></p>
	<br/>
	<h1>Users List</h1>
	<ul>
	<c:forEach var="user" items="${users}">
		<li>${user.id} | ${user.name} | ${user.email}</li>
	</c:forEach>
	</ul>
</body>
</html>