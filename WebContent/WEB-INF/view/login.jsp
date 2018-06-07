<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Login page</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h1 align="center">Login Page</h1>
	<br>
	<hr>
	<br>
	<span class = error> ${error} </span>
	<br>
	<fieldset>
		<form:form action = "processForm" modelAttribute = "loginModel" method="POST">
			Account No : 
			<br>
			 <form:input  path= "accountNo" /> 
			 <br><br>
			 
			
			<%-- Re-enter your Account No : 
			<br>
			<form:input path="accountNo" />
			<br>
			<br> --%>
			 Account Type :<br>
		<br>
		    
		    Savings: <form:radiobutton path="accountType" value="savings account" />
		    Login: <form:radiobutton path="accountType" value="loan account" />

			<input type="submit" value="Login" />
			<br>
			<br>
		</form:form>
	</fieldset>
</body>
</html>