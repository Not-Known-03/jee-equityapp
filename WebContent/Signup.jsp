<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>

<form action="SaveUserServlet" method="post">

	FirstName :  <input type="Text" name="firstName"/><br><br> 
	Email : <input type="Text" name="email"/><br><br>
	Password :  <input type="password" name="password"/><br><br>
	<input type="submit" value="Signup">
</form>
<Br><br> 
<a href="Login.jsp">Already Registered?</a>
</body>
</html>