/**
 * 	Only function defs, noting else here
 */

const generate_menu_list = (menu, menu_list) => {
	menu.innerHTML = "";
	for(let i = 0; i < menu_list.length; ++i) {
		let item_info = menu_list[i];
		let item_div = document.createElement("div");
		item_div.setAttribute("class", "menu_list_item")
		item_div.setAttribute("id", "id_menu_item_" + item_info.item_name);
		item_div.innerHTML = item_info.item_name;
		item_div.addEventListener("click", () => {
			this.location.href = item_info.redirect_to;
		});
		menu.appendChild(item_div); 
	}
};