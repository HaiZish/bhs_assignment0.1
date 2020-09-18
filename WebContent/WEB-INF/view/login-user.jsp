<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Login Screen</title>

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
			<h3> Please Enter the details below to Login:-</h3>


			<form:form action="loginUser" method="POST">
				
				
				<table>
				<!-- 
					<tr>
						<td><label></label></td>
						<td style:"color:red">${error_msg}</td>
					</tr>
				 -->
					<tr>
						<td><label>E-mail : </label></td>
						<td><input type="text" name="check_email" required placeholder="PLZ Enter you email-id"></input></td>
					</tr>
					<tr>
						<td><label>Password : </label></td>
						<td><input type="password" name="check_pass" required placeholder="PLZ Enter you password"></input></td>
					</tr>
					<tr>
			 				<td><label></label></td>
			 				<td><input type="submit"
			 							value="Login"
			 							class="save" />
			 				</td>
			 		</tr>
				</table>
			</form:form>
			<p style="color:red;">${error_msg}</p>

		</div>
	</div>
	
</body>

</html>