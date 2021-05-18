package org.teksystems.icin_bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private String email;
	private String password;
	
	
	public Admin() {
		super();
	}
	
	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("Admin [email=%s, password=%s]", email, password);
	}
	
	
}
