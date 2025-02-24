/**
 * 
 */

(() => {
	menu = document.getElementById("id_menu_list");
	home_menu_list = [
		{item_name: "Home", redirect_to: "/"},
		{item_name: "About", redirect_to: "/about"}
	];
	generate_menu_list(menu, home_menu_list);
})();

(() => {
	let logout = document.getElementById("id_logout");
	logout.addEventListener("click", () => {
		this.location.href = "/login"
	});
})();