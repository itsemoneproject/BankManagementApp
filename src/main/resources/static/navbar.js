/**
 * 	All control authority for navbar is in this file
 */

menu = document.getElementById("id_menu");

menu_list = document.getElementById("id_menu_list");
menu_list.style.display = "none";

menu.addEventListener("click", () => {
	if(menu_list.style.display === "none") {
		menu_list.style.display = "flex";
	} else {
		menu_list.style.display = "none";
	}
});
