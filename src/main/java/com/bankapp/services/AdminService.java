package com.bankapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.Entities.Admin;
import com.bankapp.repo.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepo;
	public void addAdmin(Admin admin) {
		try {
			adminRepo.save(admin);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Iterable<Admin> getAllAdmins() {
		return adminRepo.findAll();
	}
	
	public Admin getAdminByAdminName(String admin_name) {
		Admin searching_for = null;
		for(Admin admin : this.getAllAdmins()) {
			if(admin.getAdmin_name().equals(admin_name)) {
				searching_for = admin;
				break;
			}
		}
		return searching_for;
	}
	
}
