/**
 * 	Everything concerned with home page
 */

(() => {
	menu = document.getElementById("id_menu_list");
	home_menu_list = [
		{item_name: "Login", redirect_to: "/login"},
		{item_name: "About", redirect_to: "/about"}
	];
	generate_menu_list(menu, home_menu_list);
})();