<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Your Registration is Successful!...</h1>
<h2>The details entered by you are:</h2>
User:${userRegDto.name}<br>
User Name:${userRegDto.userName}<br>
Password:${userRegDto.password}<br>
CountryName:${userRegDto.country}<br>
Hobbies:
<c:forEach var="temp" items="${userRegDto.hobbies}">
	${temp}
</c:forEach><br>
Gender:${userRegDto.gender}<br>
Email:${userRegDto.commuDto.email}
<br>
Phone:${userRegDto.commuDto.phone}
</body>
</html>