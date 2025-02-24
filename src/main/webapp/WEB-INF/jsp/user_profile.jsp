<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bankapp.Entities.User" %>

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
			<div>
			<%
				Object user_obj = request.getAttribute("user");
				if(user_obj != null) {
					User user = (User)user_obj;
					out.println("<table><thead>");
					out.println("<thead><tr><th scope=\"col\">User Profile</th></tr><thead><tbody>");
				    
				    out.println("<tr><th scope=\"row\">Account number</th>");
				    out.println("<td>" + user.getAccountNumber() + "</td>");
				    out.println("</tr>");
					
				    out.println("<tr><th scope=\"row\">User name</th>");
				    out.println("<td>" + user.getUserName() + "</td>");
				    out.println("</tr>");
				    
					out.println("<tr><th scope=\"row\">First name</th>");
					out.println("<td>" + user.getFirstName() + "</td>");
				    out.println("</tr>");
					
				    out.println("<tr><th scope=\"row\">Last name</th>");
				    out.println("<td>" + user.getLastName() + "</td>");
				    out.println("</tr>");
				    
				    out.println("<tr><th scope=\"row\">Phone number</th>");
				    out.println("<td>" + user.getPhno() + "</td>");
				    out.println("</tr>");
				    
				    out.println("<tr><th scope=\"row\">Account balance</th>");
				    out.println("<td>" + user.getAccountBalance() + "</td>");
				    out.println("</tr>");
				    
				    out.println("</tbody></table>");
				}
			%>
			</div>
			<br>
			<div>
			<input type="button" id="id_logout" value="Logout"></input>
			</div>
			<br>
			<form method="POST" action="/transfer_amount">
				<fieldset>
				<legend>Transfer Amount</legend>
				<div>
					<label for="id_account_number">Account number :</label>
					<input type="number" id="id_account_number" name="account_number"/>
				</div>
				<div>
					<label for="id_amount_to_be_send">Amount :</label>
					<input type="number" id="id_amount_to_be_send" name="amount_to_be_send"/>
				</div>
				<input type="submit" value="send payment"/>
				</fieldset>
			</form>
			<script src="user_profile.js"></script>
		</body>
</html>