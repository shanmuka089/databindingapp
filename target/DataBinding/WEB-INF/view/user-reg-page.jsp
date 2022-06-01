<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	.error{
		color:red;
		margin-left:30px;
		position:fixed;
	}
</style>
<body>
<h1 align="center">Please Register here</h1>
<hr>
<form:form action="registration-success" modelAttribute="userRegDto" method="get">
<div align="center">
	<label for="name">User : </label>
	<form:input path="name" id="name" type="text"/>
	<form:errors path="name" class="error" />
	<br><br>
	<label for="uname">User Name : </label>
	<form:input path="userName" id="uname" type="text"/>
	<form:errors path="userName" class="error" />
	<br><br>
	<label for="pass">Password : </label>
	<form:input path="password" id="pass" type="password"/>
	<form:errors path="password" class="error" />
	<br><br>
	<label>Country : </label>
	<form:select path="country">
		<form:option value="ind" label="India"></form:option>
		<form:option value="aus" label="Australia"></form:option>
		<form:option value="pak" label="Pakisthan"></form:option>
		<form:option value="srl" label="Srilanka"></form:option>
		<form:option value="uae" label="UAE"></form:option>
		<form:option value="swd" label="Switzerland"></form:option>
	</form:select>
	<form:errors path="country" class="error" />
	<br><br>
	<label>Hobbies : </label>
	Cricket:<form:checkbox path="hobbies" value="cricket"/>
	Reading:<form:checkbox path="hobbies" value="reading"/>
	Travel:<form:checkbox path="hobbies" value="travel"/>
	Programming:<form:checkbox path="hobbies" value="programming"/>
	<form:errors path="hobbies" class="error" />
	<br><br>
	<label>Gender : </label>
	Male:<form:radiobutton path="gender" value="male"/>
	FeMale<form:radiobutton path="gender" value="female"/>
	<form:errors path="gender" class="error" />
	<br>
	<label>Age : </label>
	<form:input path="age"/>
	<form:errors path="age" class="error"/>
	<br>
	</div>
	<div align="center">
	<h3>Communication</h3>
	<label>Email : </label>
	<form:input path="commuDto.email"/>
	<form:errors path="commuDto.email" class="error" />
	<br><br>
	<label>Phone : </label>
	<form:input path="commuDto.phone"/>
	<input type="submit" value="Register">
	<form:errors path="commuDto.phone" class="error"/>
</div>
</form:form>
</body>
</html>