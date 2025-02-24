package com.bankapp.Entities;

import jakarta.persistence.*;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long admin_id;
	private String first_name;
	private String last_name;
	private String admin_name;
	private String admin_password;
	
	public Admin() {}

	public Admin(String first_name, String last_name, String admin_name, String admin_password) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}

	public long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	
	public String toString() {
		return "User {" +
				"admin_id : " + this.admin_id + ", " + 
				"first_name : " + this.first_name + ", " + 
				"last_name : " + this.last_name + ", " + 
				"admin_name : " + this.admin_name + ", " + 
				"admin_password : " + this.admin_password + "}";
	}
	
}
