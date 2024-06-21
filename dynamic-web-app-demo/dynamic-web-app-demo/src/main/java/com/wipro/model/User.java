package com.wipro.model;

import java.time.LocalDate;

/*
 * POJO class: Plain Old Java Object
 */
public class User {
	private String email;
	private String password;
	private LocalDate birthdate;
	
	public User() {
		
	}


	public User(String email, String password, LocalDate birthdate) {
		super();
		this.email = email;
		this.password = password;
		this.birthdate = birthdate;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDate getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}


	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", birthdate=" + birthdate + "]";
	}
	
	
	
}	
