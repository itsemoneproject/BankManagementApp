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
		<form id="id_login_form" method="POST" action="/check_login">
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
				<input type="button" id="id_create_account_redirect" value="No Account? Create New Account"/>
			</fieldset>
		</form>
		<script src="login.js"></script>
		<%
			Object obj = request.getAttribute("successful_account_creation");
			if(obj != null) {
				out.println("<script>alert(\"Account was created successfully!\")</script>");
			}
			
			obj = request.getAttribute("error_type");
			if (obj != null) {
				String error_type = (String)obj;
				if(error_type.equals("invalid_user")) {
					out.println("<script>alert(\"Invalid User Name!\")</script>");
				} else if(error_type.equals("invalid_admin")) {
					out.println("<script>alert(\"Invalid Admin Name!\")</script>");
				} else if(error_type.equals("invalid_password")) {
					out.println("<script>alert(\"Invalid Password!\")</script>");
				}
			}
		%>
	</body>
</html>