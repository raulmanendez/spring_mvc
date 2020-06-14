<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${defaultmethodcalled }</title>
</head>
<body>
	<form:form method="post" modelAttribute="student">
		<p>First path</p><form:input type="text" path="fname"/><br>
		<p>Last path</p><form:input type="text" path="lname"/><br>
		
		<h3>Direct Address</h3>
		<p><form:input type="text" path="address"/><br></p>
		
		
		<h3>Select State</h3>
		<p>
		<!-- 1. Select By Using List -->
		<%-- <form:select path="state.state" items="${state_list}"/> --%>
		
		
		<!-- //2. Use Map<String, String> as select -->
		<%-- <form:select path="state.state" items="${state_map}"/> --%>
		
		<!-- //3. Use List<State> as select -->
		<%-- <form:select path="state.state" items="${state_obj_list}" itemValue="state" itemLabel="id"/> --%>
		
		<!-- //4. Use List<State> as select -->
		<form:select path="state.state">
			<form:option value="Select One Option"></form:option>
			<form:options items="${state_obj_list}" itemValue="state" itemLabel="id"></form:options>
		</form:select>
		
		<br></p>
		
		
		<%-- <h3>Address</h3>
		<p>City</p><form:input type="text" path="address.city" value="${student.address.city}"><br>
		<p>Zip Code</p><form:input type="text" path="address.zipcode" value="${student.address.zipcode}"><br> --%>
		<input type="submit" value="Go">
	</form:form>
</body>
</html>