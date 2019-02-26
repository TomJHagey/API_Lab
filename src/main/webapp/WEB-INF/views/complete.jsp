<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>


	<div class = "container">
	<table class = "table table-striped">
		
		<th>First Name</th>
		<th>Last Name</th>
		<th>Innovation</th>
		<th>Year</th>
		
		<c:forEach items="${complete}" var="complete">
			<tr>
				<td>${complete.firstName}</td>
				<td>${compete.lastName}</td>
				<td>${complete.innovation}</td>
				<td>${complete.year }</td>
				
			</tr>
		</c:forEach>

	</table>

<a href="/"><button type="button" class="btn btn-info">Home Page</button></a>

</body>
</html>