<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new account</title>
</head>
<body>

	<form:form method="post" commandName="acc" action="../edit.html">
		Username <form:input path="username" readonly="true"/><br>
		Password <form:password path="password"/><br>
		Full name <form:input path="fullname"/><br>
		Email <form:input path="email"/><br>
		<input type="submit" value="Save">
	</form:form>

</body>
</html>