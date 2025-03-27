<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<h1>Welcome to Login Page</h1>
		
		<c:if test="${not empty errorMsg}">
			<h4 style="color:red">${errorMsg}</h4>
		</c:if>
				
		
		<form action="loginForm" method="post">
			Email: <input type="text" name="email"/><br/><br/>
			Password: <input type="password" name="password"/><br/><br/>
			<input type="submit" value="Login"/>
		</form>
		
		<br/><br/>
		
		If not registered...<a href="regPage"><b>Click Here</b></a>
	</body>
</html>