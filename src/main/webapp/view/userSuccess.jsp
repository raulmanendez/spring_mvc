<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Success</title>
</head>
<body>

	<h1>User Saved Successfully</h1>
	<p>Name: ${savedUser.name}</p>
	<p>Email: ${savedUser.email}</p>
	<p>Birthday: ${savedUser.birthday}</p>
	<p>Age: ${savedUser.age}</p>
	<p>Role: ${savedUser.role}</p>
	
	<p>Profile Image: <img width="30%" height="30%" src="<spring:url value='/resources/images/${savedUser.profile_pic.originalFilename}' />"></p>
	
	<h2>Address Info</h2>
	<p>Street: ${savedUser.addr.street}</p>
	<p>State: ${savedUser.addr.state}</p>
	<p>Zip Code: ${savedUser.addr.zipcode}</p>


</body>
</html>