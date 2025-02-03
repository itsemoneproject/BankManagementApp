<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>BankApp (Login)</title>
		<link rel="stylesheet" href="login.css">
		<script src="functions.js"></script>
	</head>
	<body>
		<jsp:include page="navbar.jsp"/>
		<form id="id_login_form" method="GET" action="/check_login">
			<fieldset>
			<legend>Login</legend>
				<div>
					<label for="id_user_login">User Login</label>
					<input type="radio" id="id_user_login" name="login_selector" value="user_login" checked/>
				</div>
				<div>
					<label for="id_admin_login">Admin Login</label>				
					<input type="radio" id="id_admin_login" name="login_selector" value="admin_login"/>
				</div>
				<div id="id_login_form_content"></div>
				<input type="button" id="id_login_button" value="Login"/>
			</fieldset>
		</form>
		<script src="login.js"></script>
	</body>
</html>