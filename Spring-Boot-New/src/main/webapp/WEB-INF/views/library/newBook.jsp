<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="newBook" method="post">
	<table>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>When Published</td>
			<td><input type="text" name="whenPublished"/></td>
		</tr>
		
		<tr>
			<td>
			<input type="submit" name="submit" value="Save"/>
			</td>
			<td>
			<input type="submit" name="submit" value="Cancel"/>
			</td>
			
			<td>
			<a href="/${lib.id}">${lib.id}<input type="submit" name="submit" value="Add_Book"/></a>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>