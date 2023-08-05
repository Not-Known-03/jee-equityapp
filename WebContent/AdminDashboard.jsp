<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>

Welcome , ${user.firstName}


<br>
<a href="AddEqServlet">Add Equity</a> | <a href="AddPriceServlet">Add Price</a>
<br>
<a href="LogoutServlet">Logout</a> 
</body>
</html>