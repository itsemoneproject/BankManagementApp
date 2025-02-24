<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>BankApp (New Account)</title>
		<link rel="stylesheet" href="new_account.css">
		<script src="functions.js"></script>
	</head>
	<body>
		<jsp:include page="navbar.jsp"/>
		<form id="id_new_account_form" method="POST" action="/create_account">
			<fieldset>
			<legend>Create New Account</legend>
				<div>
					<label for="id_user_account">New User Account</label>
					<input type="radio" id="id_user_account" name="account_selector" value="user_account" checked/>
				</div>
				<div>
					<label for="id_admin_account">New Admin Account</label>				
					<input type="radio" id="id_admin_account" name="account_selector" value="admin_account"/>
				</div>
				<div id="id_new_account_form_content"></div>
				<input type="button" id="id_new_account_button" value="Create Account"/>
			</fieldset>
		</form>
		<script src="new_account.js"></script>
	</body>
</html>