<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo</title>
</head>
<body>
<h1>${errorMessage}</h1>
<form action="/spring-mvc/login" method="post">
Name:<input type = "text" name="name"/><br>
Password:<input type = "password" name="password"/><br><br>
<input type="submit" value ="submit"/>
</form>
</body>
</html>