<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500&display=swap" rel="stylesheet"> 
</head>
<body>
<form action="newCar" method="post">
 <div class="form-row">
	<table>
		<tr>
			<td>Make</td>
			<td><input type="text" name="make"/></td>
		</tr>
		<tr>
			<td>Model</td>
			<td><input type="text" name="model"/></td>
		</tr>
		<tr>
			<td>Year</td>
			<td><input type="text" name="yearManufactured"/></td>
		</tr>
		<tr>
			<td>Color</td>
			<td><input type="text" name="color"/></td>
		</tr>
		<tr>
			<td>Kms</td>
			<td><input type="text" name="kms"/></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><input type="text" name="price"/></td>
			
		</tr>
		<tr>
			<td>
			<input type="submit" name="submit" value="Save"/>
			</td>
			<td>
			<input type="submit" name="submit" value="Cancel"/>
			</td>
		</tr>
	</table>
	</div>
	</form>
</body>
</html>