package com.bankapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bankapp.Entities.User;
import com.bankapp.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class TransactionController {
	
	@Autowired
	UserService user_service;
	
	@RequestMapping("/transfer_amount")
	public String transfer_amount(HttpServletRequest request, HttpSession session) {
		float amount = Integer.parseInt(request.getParameter("amount_to_be_send"));
		if(amount < 0) {
			return "error_transfer_amount";
		}
		
		long account_number = Integer.parseInt(request.getParameter("account_number"));
		User to_user = user_service.getUserByAccountNumber(account_number);
		User from_user = user_service.getUserByUserName((String)session.getAttribute("name"));
		if(to_user == null) {
			return "error_transfer_amount";
		}
		
		float sender_balance = from_user.getAccountBalance();
		if(sender_balance < amount) {
			return "error_transfer_amount";
		}
		
		from_user.setAccountBalance(sender_balance - amount);
		user_service.addUser(from_user);
		to_user.setAccountBalance(to_user.getAccountBalance() + amount);
		user_service.addUser(to_user);
		return "transfer_success";
	}

	@RequestMapping("/admin_add_amount")
	public String admin_add_amount(HttpServletRequest request) {
		float amount = Integer.parseInt(request.getParameter("amount_to_be_send"));
		if(amount < 0) {
			return "error_transfer_amount";
		}
		
		long account_number = Integer.parseInt(request.getParameter("account_number"));
		User to_user = user_service.getUserByAccountNumber(account_number);
		if(to_user == null) {
			return "error_transfer_amount";
		}
		to_user.setAccountBalance(to_user.getAccountBalance() + amount);
		user_service.addUser(to_user);
		return "transfer_success";
	}
	
}
