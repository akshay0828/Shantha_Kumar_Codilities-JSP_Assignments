<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h2> List of authors</h2>
<table >
	<thead>
		<tr>
		<td>ID</td>
		<td>Name</td>
		<td>PHNO</td>
		<td>Book_name</td>
		<td>Book_Published</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${library}"  var="lib" >
		<tr>
		<td><a href="newAuthor/${lib.id}">${lib.id}</a></td>
		<td>${lib.name }</td>
		<td>${lib.phoneNo}</td>

		</tr>
		
		</c:forEach>
	</tbody>
</table>
</body>
</html>