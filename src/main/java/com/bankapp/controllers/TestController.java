package com.bankapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/greet/{name}")
	@ResponseBody
	public String greet(@PathVariable("name") String name) {
		return "Hello " + name + "!";
	}
}
