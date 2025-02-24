package com.bankapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bankapp.Entities.Admin;
import com.bankapp.Entities.User;
import com.bankapp.services.AdminService;
import com.bankapp.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	UserService user_service;
	@Autowired
	AdminService admin_service;
	
	@RequestMapping(value="/check_login", 
					method=RequestMethod.GET)
	public String check_login(HttpSession session, HttpServletRequest request) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(request.getParameter("login_selector").equals("user_login")) {
			User user = user_service.getUserByUserName(name);
			if(user == null) {
				request.setAttribute("error_type", "invalid_user");
				return "login";
			}
			if(!user.getUserPassword().equals(password)) {
				request.setAttribute("error_type", "invalid_password");
				return "login";
			}
			session.setAttribute("logged_in", true);
			request.setAttribute("user", user);
			return "user_profile";
		} else { // admin_login
			Admin admin = admin_service.getAdminByAdminName(name);
			if(admin == null) {
				request.setAttribute("error_type", "invalid_admin");
				return "login";
			}
			if(!admin.getAdmin_password().equals(password)) {
				request.setAttribute("error_type", "invalid_password");
				return "login";
			}
			session.setAttribute("logged_in", true);
			request.setAttribute("admin", admin);
			return "admin_profile";
		}
	}
	
	@RequestMapping(value="/user_profile", 
					method=RequestMethod.POST)
	public String user_profile() {
		return "user_profile";
	}
	
	@RequestMapping(value="/admin_profile", 
					method=RequestMethod.POST)
	public String admin_profile() {
		return "admin_profile";
	}
}
