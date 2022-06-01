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
<form:form action="processCredit" modelAttribute="creditCard">
<div align="center">
	<label>BILL</label><br><br>
	<label>Card Number :</label>
	<form:input path="cnum"/>
	<br>
	<br>
	<label>Amount :</label>
	<form:input path="cardFields.ccur"/>
	<br>
	<br>
	<label>Currency :</label>
	<form:input path="currency"/>
	<br>
	<br>
	
	<label>Date :</label>
	<form:input path="date"/>
	<br>
	<br>
	<input type="submit" value="pay bill">
</div>
</form:form>
</body>
</html>