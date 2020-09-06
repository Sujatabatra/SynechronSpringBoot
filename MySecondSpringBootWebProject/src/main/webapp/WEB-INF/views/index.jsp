<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="./login" method="post" modelAttribute="user">
<form:select path="">
	<form:option value="">Select Name </form:option>
	<form:options items="${displayNames }"/> 
</form:select>
<br><br>

<form:radiobuttons path="" items="${displayNames }"/>
<br><br>
Enter UserName: <form:input path="username"/><br><br>
Enter password <form:password path="password"/><br><br>
<input type="submit" value="login">
</form:form>

<%-- 
<form action="./login" method="post">
	Enter UserName : <input type="text" name="uname"><br><br>
	Enter Password : <input type="password" name="pwd"><br><br>
	<input type="submit" value="Login">
</form>--%>
</body>
</html>