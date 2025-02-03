package com.bankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/check_login")
	public String check_login() {
		return "test";
	}
}
