<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bankapp.Entities.User" %>
<!-- this file is strictly for testing stuff related to JSP, DO NOT USER FOR PROJECT RELATED TASKS -->
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Profile</title>
			<link rel="stylesheet" href="user_profile.css">
			<script src="functions.js"></script>
		</head>
		<body>
			<jsp:include page="navbar.jsp"/>
			<%
				Object obj = session.getAttribute("logged_in");
				if(obj == null) {
					out.println("<script>alert(\"Logged Out (Session has expired)!\")</script>");
					response.sendRedirect("/login");
				}
			%>
			<%
				Object user_obj = request.getAttribute("user");
				if(user_obj != null) {
					User user;
					user = (User)user_obj;
					out.println(user.toString());
				}
			%>
			<script src="admin_profile.js"></script>
		</body>
</html>