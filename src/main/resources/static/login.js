/**
 * 
 */

(() => {
	menu = document.getElementById("id_menu_list");
	login_menu_list = [
		{item_name: "Home", redirect_to: "/"},
		{item_name: "Create New Account", redirect_to: "/new_account"},
		{item_name: "About", redirect_to: "/about"}
	];
	generate_menu_list(menu, login_menu_list);
})();