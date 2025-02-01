package com.bankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/about") 
	public String about() {
		return "about";
	}
}
