


(() => {
	menu = document.getElementById("id_menu_list");
	new_account_menu_list = [
		{item_name: "Home", redirect_to: "/"},
		{item_name: "Login", redirect_to: "/login"},
		{item_name: "About", redirect_to: "/about"}
	];
	generate_menu_list(menu, new_account_menu_list);
})();

function new_account_form_generator(for_who) {
  let name_field = (for_who === "user_account" ? "User" : "Admin") + " Name :";
  let pass_field = (for_who === "user_account" ? "User" : "Admin") + " Password :";
  let container = document.getElementById("id_new_account_form_content");
  container.innerHTML = "";
  
  // First Name
  let firstNameDiv = document.createElement("div");
  firstNameDiv.innerHTML = "<label for='id_first_name'>First Name :</label>";
  let firstNameInput = document.createElement("input");
  firstNameInput.setAttribute("type", "text");
  firstNameInput.setAttribute("id", "id_first_name");
  firstNameInput.setAttribute("name", "first_name");
  firstNameInput.setAttribute("class", "text_class");
  firstNameDiv.appendChild(firstNameInput);
  container.appendChild(firstNameDiv);
  
  // Last Name
  let lastNameDiv = document.createElement("div");
  lastNameDiv.innerHTML = "<label for='id_last_name'>Last Name :</label>";
  let lastNameInput = document.createElement("input");
  lastNameInput.setAttribute("type", "text");
  lastNameInput.setAttribute("id", "id_last_name");
  lastNameInput.setAttribute("name", "last_name");
  lastNameInput.setAttribute("class", "text_class");
  lastNameDiv.appendChild(lastNameInput);
  container.appendChild(lastNameDiv);
  
  // Phone Number (Only for Customer)
  if (for_who === "user_account") {
    let phoneDiv = document.createElement("div");
    phoneDiv.innerHTML = "<label for='id_phno'>Phone Number :</label>";
    let phoneInput = document.createElement("input");
    phoneInput.setAttribute("type", "number");
    phoneInput.setAttribute("id", "id_phno");
    phoneInput.setAttribute("name", "phno");
    phoneInput.setAttribute("class", "text_class");
    phoneDiv.appendChild(phoneInput);
    container.appendChild(phoneDiv);
  }
  
  // Username
  let usernameDiv = document.createElement("div");
  usernameDiv.innerHTML += "<label for='id_name'>" + name_field + "</label>"; 
  let usernameInput = document.createElement("input");
  usernameInput.setAttribute("type", "text");
  usernameInput.setAttribute("id", "id_name");
  usernameInput.setAttribute("name", (for_who === "user_account" ? "user" : 'admin') + "_name");
  usernameInput.setAttribute("class", "text_class");
  usernameDiv.appendChild(usernameInput);
  container.appendChild(usernameDiv);
  
  // Password
  let passwordDiv = document.createElement("div");
  passwordDiv.innerHTML += "<label for='id_password'>" + pass_field + "</label>"; 
  let passwordInput = document.createElement("input");
  passwordInput.setAttribute("type", "password");
  passwordInput.setAttribute("id", "id_password");
  passwordInput.setAttribute("name", (for_who === "user_account" ? "user" : 'admin') + "_password");
  passwordInput.setAttribute("class", "text_class");
  passwordDiv.appendChild(passwordInput);
  container.appendChild(passwordDiv);
}

function check_fields() {
	const accountSelector = document.getElementsByName("account_selector");
	let for_who = null;
	for (let i = 0; i < accountSelector.length; i++) {
	  if(accountSelector[i].checked) {
		for_who = accountSelector[i].value;
	  }
	}
	let e1 = document.getElementById("id_first_name").value;
	if(e1 === "" || e1 === null) return false;
	let e2 = document.getElementById("id_last_name").value;
	if(e2 === "" || e2 === null) return false;
	if(for_who === "user_account") {
		let e3 = document.getElementById("id_phno").value;
		if(e3 === "" || e3 === null) return false;
	}
	let e4 = document.getElementById("id_name").value;
	if(e4 === "" || e4 === null) return false;
	let e5 = document.getElementById("id_password").value;
	if(e5 === "" || e5 === null) return false;
	return true;
}

(() => {
  new_account_form_generator("user_account");

  const accountSelector = document.getElementsByName("account_selector");
  for (let i = 0; i < accountSelector.length; i++) {
    accountSelector[i].addEventListener("click", function() {
      new_account_form_generator(this.value);
    });
  }
  
  let createAccountButton = document.getElementById("id_new_account_button");
  let newAccountForm = document.getElementById("id_new_account_form");
  createAccountButton.addEventListener("click", () => {
	if(!check_fields()) { 
		alert("NO FIELD IN THE FORM CAN BE EMPTY!");	
		return;
	}
    newAccountForm.submit();
  });
})();
