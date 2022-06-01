<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>send rseult to your email</h1>
	<h1>Hello! ${userName}</h1>
	<form:form action="process-email" modelAttribute="emailDto">
		<label>Enter your email</label>
		<form:input type="email" path="userEmail"/>
		<input type="submit" value="send">
	</form:form>

</body>
</html>