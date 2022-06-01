<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.error{
		color:red;
		position: fixed;
		text-align: left;
		margin-left: 30px;
	}

</style>
<script type="text/javascript">
	function validate(){
		var username=document.getElementById('name').value;
		if(username.length < 1){
			alert("your name must have atleast one character!.")
			return false;
		}
		var cname=document.getElementById('cname').value;
		if(cname.length < 1){
			alert("your crush name must have atleast one character!.")
			return false;
		}
	}
</script>
</head>
<body>
	<h1 align="center">Love Caluculator</h1>
	<hr>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validate()">
	<div align="center">
	<p>
	<label for="name">Your Name:</label>
	<form:input path="userName" id="name"/>
	<form:errors path="userName" class="error"/>
	</p>
	<p>
	<label for="cname">Crush Name:</label>
	<form:input path="crushName" id="cname"/>
	<form:errors path="crushName" class="error"/>
	</p>
	
	<p>
	<form:checkbox path="checkBox" id="check"/>
	<label>I am agreeing that these is for fun</label>
	<form:errors path="checkBox" class="error"/>
	</p>
	
	<input type="submit" value="calculate"/>
	</div>
	</form:form>
</body>
</html>