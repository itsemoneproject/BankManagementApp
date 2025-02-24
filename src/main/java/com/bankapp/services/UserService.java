package com.bankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.Entities.Admin;
import com.bankapp.Entities.User;
import com.bankapp.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository user_repo;
	public void addUser(User user) {
		try {
			user_repo.save(user);
		} catch(Exception e) { 
			e.printStackTrace();
		}
	}
	
	public Iterable<User> getAllUsers() {
		return user_repo.findAll();
	}
	
	public User getUserByUserName(String user_name) {
		User searching_for = null;
		for(User user : this.getAllUsers()) {
			if(user.getUserName().equals(user_name)) {
				searching_for = user;
				break;
			}
		}
		return searching_for;
	}
}
