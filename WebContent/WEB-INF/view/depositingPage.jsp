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
	<h1 align="center">Deposit page</h1>
	<br>
	<hr>
	<br>
	<fieldset>
		<form:form action = "depositProcessingPage" modelAttribute="account" method="POST">
			Enter the amount you want to deposit:
			<br>
			 <form:input  path= "accountBalance" /> 
			 <br><br>

			<input type="submit" value="deposit" />
			<br>
			<br>
		</form:form>
	</fieldset>
</body>
</html>