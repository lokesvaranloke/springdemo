<%@page import="java.util.List"
	import="com.samples.s08Springmvc.domain.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= request.getAttribute("employees") %>
	<br/><br/>
	<%
	
		List<Employee> employees = (List<Employee>)request.getAttribute("employees");
		for(Employee e: employees){
			out.println(e.getId());
			out.println(e.getName());
			out.println(e.getSalary());
			out.println("<br/>");
		}
	%>
</body>
</html>