package com.bankapp.Entities;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long   account_number;
	private String first_name;
	private String last_name;
	private String phno;
	private String user_name;
	private String user_password;
	private float  account_balance;
	
	public User() {}
	
	public User(String first_name, String last_name, String phno, String user_name, String user_password, float account_balance) {
		// this.account_number = 0; // auto-generated
		this.first_name = first_name;
		this.last_name = last_name;
		this.phno = phno;
		this.user_name = user_name;
		this.user_password = user_password;
		this.account_balance = account_balance;
	}
	
	public long getAccountNumber() {
		return account_number;
	}
	
	public void setAccountNumber(long account_number) {
		this.account_number = account_number;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public String getPhno() {
		return phno;
	}
	
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	public String getUserName() {
		return user_name;
	}
	
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}
	
	
	public String getUserPassword() {
		return user_password;
	}
	
	public void setUserPassword(String user_password) {
		this.user_password = user_password;
	}
	
	public float getAccountBalance() {
		return account_balance;
	}
	
	public void setAccountBalance(float account_balance) {
		this.account_balance = account_balance;
	}
	
	public String toString() {
		return "User {" +
				"account_number : " + this.account_number + ", " + 
				"first_name : " + this.first_name + ", " + 
				"last_name : " + this.last_name + ", " + 
				"phno : " + this.phno + ", " + 
				"user_name : " + this.user_name + ", " + 
				"user_password : " + this.user_password + ", " + 
				"account_balance : " + this.account_balance + "} ";
	}
}
