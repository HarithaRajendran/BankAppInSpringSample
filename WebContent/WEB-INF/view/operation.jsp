<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Bank</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h1 align="center">Welcome To *** Bank</h1>
	<br>
	<hr>
	<br>
	<h2>Choose any operation</h2>
	<br><br>
	
		<fieldset style = "align : right">
		<form:form action = "deposit" modelAttribute = "user" method="POST">
			<input type = "submit" Value = "Deposit"/>
		</form:form>
		<br><br>
		
		<form:form action = "withdraw" modelAttribute = "user" method="POST">
			<input type = "submit" Value = "withdraw"/>
		</form:form>
		<br><br>
		
		<form:form action = "balanceEnquiry" modelAttribute = "user" method="POST">
			<input type = "submit" Value = "balanceEnquiry"/>
		</form:form>
		<br><br>
	</fieldset>

</body>
</html>