<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Dashboard Screen</title>

	<!-- css bkcdi -->
	<link	type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/khoobsurat_saman/css/style.css">
			
	<link	type="text/css"
			rel="stylesheet"
			href="${pageContext.request.contextPath}/khoobsurat_saman/css/login-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h1> ERM - Employee Relationship Manager </h1>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<h2> Welcome User :- ${user_ob.name} </h2>

			


		</div>
	</div>
	
</body>

</html>