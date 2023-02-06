<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Calculator</title>
</head>
<body>
	<h1>Hello! Welcome to my Basic Calculator Web Application.</h1>
	<form action="getValuesServlet" method="post">
	Enter the integer values you wish to calculate:
	<div>
	Value 1:
		<input type="text" name="value1" size="100">
	</div>
	<br>
	<div>
	Value 2:
		<input type="text" name="value2" size="100">
	</div>
	<br>
	<input type="submit" value="Calculate Values" />
	</form>
</body>
</html>