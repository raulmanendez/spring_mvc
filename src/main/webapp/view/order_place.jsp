<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error
{
color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title }</title>
</head>
<body>
	<form:form method="post" modelAttribute="order" action="save">
		<p>Product Name</p>
		<form:input type="text" path="productName"/>
		<form:errors path="productName" cssClass="error"/>
		<br>
		
		<p>Quantity</p>
		<form:input type="text" path="quantity"/>
		<form:errors path="quantity" cssClass="error"/>
		<br>
		<input type="submit" value="Place">
	</form:form>
</body>
</html>