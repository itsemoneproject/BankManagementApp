/**
 * 
 */

(() => {
	menu = document.getElementById("id_menu_list");
	new_account_menu_list = [
		{item_name: "Home", redirect_to: "/"},
		{item_name: "Login", redirect_to: "/login"},
		{item_name: "About", redirect_to: "/about"}
	];
	generate_menu_list(menu, new_account_menu_list);
})();