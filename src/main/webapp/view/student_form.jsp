<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${defaultmethodcalled }</title>
</head>
<body>
	<form method="post">
		<p>First Name</p><input type="text" name="fname" value="${student.fname}"><br>
		<p>Last Name</p><input type="text" name="lname" value="${student.lname}"><br>
		
		<h3>Direct Address</h3>
		<p><input type="text" name="address.city" value="${student.address.city} ${student.address.zipcode}"><br></p>
		
		<%-- <h3>Address</h3>
		<p>City</p><input type="text" name="address.city" value="${student.address.city}"><br>
		<p>Zip Code</p><input type="text" name="address.zipcode" value="${student.address.zipcode}"><br> --%>
		<input type="submit" value="Go">
	</form>
</body>
</html>