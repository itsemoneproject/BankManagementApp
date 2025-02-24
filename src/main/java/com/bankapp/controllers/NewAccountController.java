package com.bankapp.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bankapp.Entities.Admin;
import com.bankapp.Entities.User;
import com.bankapp.services.AdminService;
import com.bankapp.services.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class NewAccountController {
	
	@Autowired
	private UserService user_service;
	@Autowired
	private AdminService admin_service;
	
	@RequestMapping(value="/create_account", 
					method=RequestMethod.POST,
					consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String create_account(HttpServletRequest request) {
		String admin_name = request.getParameter("admin_name");
		String user_name = request.getParameter("user_name");
		ArrayList<Admin> admins = (ArrayList<Admin>) admin_service.getAllAdmins();
		ArrayList<User> users = (ArrayList<User>) user_service.getAllUsers();
		
		boolean already_exists = false;
		for(Admin admin : admins) {
			if(admin.getAdmin_name().equals(admin_name) || admin.getAdmin_name().equals(user_name)) {
				already_exists = true;
			}
		}
		for(User user : users) {
			if(user.getUserName().equals(user_name) || user.getUserName().equals(admin_name)) {
				already_exists = true;
			}
		}
		
		if(already_exists) return "error_account_creation";
	
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String phno = request.getParameter("phno");
		String account_selector = request.getParameter("account_selector");
		if(account_selector.equals("user_account")) {
			String user_password = request.getParameter("user_password");
			User user = new User(first_name, last_name, phno, user_name, user_password, 1000.0f);
			user_service.addUser(user);
		} else if (account_selector.equals("admin_account")) {
			String admin_password = request.getParameter("admin_password");
			Admin admin = new Admin(first_name, last_name, admin_name, admin_password);
			admin_service.addAdmin(admin);
		}
		
		request.setAttribute("successful_account_creation", true);
		return "login";
	}
}
