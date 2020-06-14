<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="../resources/js/new.js"></script>
<link href="../resources/css/new.css">
<title>Static Resource</title>
</head>
<body>
	<fieldset>
		<legend>Added Static Resource using /mvc:default-servlet-handler/</legend>
		
		<p>Simple URL image Under images/hulk.jpg</p>
		<img alt="NA" src="../resources/images/hulk.jpg" width="100px" height="100px">
		
		<p>Spring URL image Under images/hulk.jpg</p>
		<img src="<spring:url value='/resources/images/hulk.jpg'/>" width="100px" height="100px"/>
		
		<p>Simple URL Image Under images/images_new/lion.jpg</p><br>
		<img alt="NA" src="../resources/images/images_new/lion.jpg" width="100px" height="100px">
		
		
		
		<p>CSS Under css/new.css</p><br>
		<p>JS Under js/new.js</p><br>
	</fieldset>
	
	<fieldset>
		<legend>Added Static Resource using /mvc:resources mapping="/muk/**" location="/resources/"</legend>
		
		<p>Simple URL image Under images/hulk.jpg</p>
		<img alt="NA" src="../muk/images/hulk.jpg" width="100px" height="100px">
		
		<p>Spring URL image Under images/hulk.jpg</p>
		<img src="<spring:url value='/muk/images/hulk.jpg'/>" width="100px" height="100px"/>
		
		<p>Simple URL Image Under images/images_new/lion.jpg</p><br>
		<img alt="NA" src="../muk/images/images_new/lion.jpg" width="100px" height="100px">
		
		
		
		<p>CSS Under css/new.css</p><br>
		<p>JS Under js/new.js</p><br>
	</fieldset>
</body>
</html>