<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Transaction Success</title>
		<style>
			body {
				padding: 0px;
				margin: 0px;	
			}
		</style>
		<script src="functions.js"></script>
	</head>
	<body>
		<jsp:include page="navbar.jsp"/>
		<h2>Succeeded in transfering the money</h2>
		<input type="button" id="id_go_back" value="Go Back"/>
		<script>
		(() => {
			menu = document.getElementById("id_menu_list");
			new_account_menu_list = [
				{item_name: "Home", redirect_to: "/"},
				{item_name: "Create New Account", redirect_to: "/new_account"},
				{item_name: "About", redirect_to: "/about"}
			];
			generate_menu_list(menu, new_account_menu_list);
			
			document.getElementById("id_go_back").addEventListener("click", () => {
				window.history.back();
			});
		})();
		</script>
	</body>
</html>