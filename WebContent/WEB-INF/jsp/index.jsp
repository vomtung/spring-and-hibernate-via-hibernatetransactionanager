<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

	<a href="${pageContext.request.contextPath }/account/add.html">Add new account</a>
	<br><br>
	<table border="1">
		<tr>
			<th>Username</th>
			<th>Full Name</th>
			<th>Option</th>
		</tr>
		<c:forEach var="acc" items="${la}">
			<tr>
				<td>${acc.username }</td>
				<td>${acc.fullname }</td>
				<td><a href="${pageContext.request.contextPath }/account/delete/${acc.username }.html" onclick="return confirm('Are you sure?')">Delete</a> | 
				<a href="${pageContext.request.contextPath }/account/edit/${acc.username }.html">Edit</a></td>
			</tr>
		</c:forEach>
	</table>	

</body>
</html>