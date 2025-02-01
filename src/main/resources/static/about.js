/**
 * 
 */

(() => {
	menu = document.getElementById("id_menu_list");
	about_menu_list = [
		{item_name: "Home", redirect_to: "/"}
	];
	generate_menu_list(menu, about_menu_list);
})();