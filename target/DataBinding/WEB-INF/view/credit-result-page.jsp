<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Locale" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>Hello wait formatter is getting ready</h1>
		${creditCard.cnum}<br>
		${creditCard.cardFields.ccur}<br>
		${creditCard.date}<br>
		${creditCard.currency.displayName}<br>
	</div>
</body>
</html>