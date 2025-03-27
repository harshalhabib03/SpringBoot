<!DOCTYPE html>
<html>
	<head>
		<title>Register</title>
	</head>
	<body>
		<h1>Welcome to Register Page</h1>
		
		<c:if test="${not empty successMsg}">
			<h4 style="color:green">${successMsg}</h4>
		</c:if>
		
		<c:if test="${not empty errorMsg}">
			<h4 style="color:red">${errorMsg}</h4>
		</c:if>
				
		
		<form action="regForm" method="post">
			Name: <input type="text" name="name"/><br/><br/>
			Email: <input type="text" name="email"/><br/><br/>
			Password: <input type="password" name="password"/><br/><br/>
			Phone No: <input type="number" name="phoneno"/><br/><br/>
			<input type="submit" value="Register"/>
		</form>
		
		<br/><br/>
		
		If already registered...<a href="loginPage"><b>Click Here</b></a>
	</body>
</html>