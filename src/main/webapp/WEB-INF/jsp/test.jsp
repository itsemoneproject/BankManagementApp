<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- this file is strictly for testing stuff related to JSP, DO NOT USER FOR PROJECT RELATED TASKS -->
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>TestJSP</title>
		</head>
		<body>
			<%
				String for_who = request.getParameter("login_selector");
				String name = request.getParameter("name");
				String password = request.getParameter("password");
				out.println(for_who + "<br>" + name + "<br>" + password);
			%>
		</body>
</html>