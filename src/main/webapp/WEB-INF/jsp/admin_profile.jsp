<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.bankapp.Entities.Admin" %>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Profile</title>
			<link rel="stylesheet" href="admin_profile.css">
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
				Object admin_obj = request.getAttribute("admin");
				if(admin_obj != null) {
					Admin admin = (Admin)admin_obj;
					out.println("<table><thead>");
					out.println("<thead><tr><th scope=\"col\">Admin Profile</th></tr><thead><tbody>");
				    
				    out.println("<tr><th scope=\"row\">Admin ID</th>");
				    out.println("<td>" + admin.getAdmin_id() + "</td>");
				    out.println("</tr>");
					
				    out.println("<tr><th scope=\"row\">Admin name</th>");
				    out.println("<td>" + admin.getAdmin_name() + "</td>");
				    out.println("</tr>");
				    
					out.println("<tr><th scope=\"row\">First name</th>");
					out.println("<td>" + admin.getFirst_name() + "</td>");
				    out.println("</tr>");
					
				    out.println("<tr><th scope=\"row\">Last name</th>");
				    out.println("<td>" + admin.getLast_name() + "</td>");
				    out.println("</tr>");
				    
				    out.println("</tbody></table>");
				}
			%>
			<input type="button" id="id_logout" value="Logout"></input>
			<script src="admin_profile.js"></script>
		</body>
</html>