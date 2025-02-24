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


function login_form_generator(for_who) {
	let name_field = (for_who === "user_login" ? "User" : "Admin") + " Name :";
	let pass_field = (for_who === "user_login" ? "User" : "Admin") + " Password :";
	let div = document.getElementById("id_login_form_content");
	div.innerHTML = "";
	
	let name_div = document.createElement("div");
	name_div.innerHTML += "<label for='id_name'>" + name_field + "</label>"; 
	let name = document.createElement("input");
	name.setAttribute("type", "text");
	name.setAttribute("id", "id_name")
	name.setAttribute("name", "name");
	name.setAttribute("class", "text_class");
	name_div.appendChild(name);
	
	let pass_div = document.createElement("div");
	pass_div.innerHTML += "<label for='id_pass'>" + pass_field + "</label>"; 
	let pass = document.createElement("input");
	pass.setAttribute("type", "password");
	pass.setAttribute("id", "id_pass")
	pass.setAttribute("name", "password");
	pass.setAttribute("class", "text_class");
	pass_div.appendChild(pass);
	
	div.appendChild(name_div);
	div.appendChild(pass_div);
}

(() => {
	login_form_generator("user_login");
	login_selector = document.getElementsByName("login_selector");
	for(let i = 0; i < login_selector.length; ++i) {
		let radio = login_selector[i];
		radio.addEventListener("click", () => {
			login_form_generator(radio.value);		
		});
	}
})();

function check_fields() {
	const login_selector = document.getElementsByName("login_selector");
	let for_who = null;
	for (let i = 0; i < login_selector.length; i++) {
	  if(login_selector[i].checked) {
		for_who = login_selector[i].value;
	  }
	}

	let e3 = document.getElementById("id_name").value;
	if(e3 === "" || e3 === null) return false;
	let e4 = document.getElementById("id_pass").value;
	if(e4 === "" || e4 === null) return false;

	return true;
}

(() => {
	let login_button = document.getElementById("id_login_button");
	let login_form = document.getElementById("id_login_form");
	login_button.addEventListener("click", () => {
		if(!check_fields()) { 
			alert("NO FIELD IN THE FORM CAN BE EMPTY!");	
			return;
		}
		login_form.submit();
	});	
	let goto_create_account_button = document.getElementById("id_create_account_redirect");
	goto_create_account_button.addEventListener("click", () => {
		this.location.href = "/new_account"
	});	
})();
