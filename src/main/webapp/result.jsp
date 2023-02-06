<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Calculator Results</title>
</head>
<body>
	<p>Below are the following calculations: <br />
	First Value: ${userValuesPouch.getFirstValue()} -            
	Second Value: ${userValuesPouch.getSecondValue()} 
	<br>
	Addition: ${userValuesPouch.getAdd()} <br />
	Subtraction: ${userValuesPouch.getSubtract()} <br />
	Multiplication: ${userValuesPouch.getMultiply()} <br />
	Division: ${userValuesPouch.getDivide()} <br />
	Division Remainder: ${userValuesPouch.getRemainder()} <br />
	</p>
	<a href="index.jsp">Enter a new set of values to calculate</a>
</body>
</html>