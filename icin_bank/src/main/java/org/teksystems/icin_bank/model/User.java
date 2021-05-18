package org.teksystems.icin_bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String dob;
	private String phoneNumber;
	private String accountNumber;
	private String password;
	private Long balance=10000l;
	
	public User() {
		super();
	}

	public User(String name, String email, String dob, String phoneNumber, String accountNumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.accountNumber = accountNumber;
		this.password = password;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format(
				"User [id=%s, name=%s, email=%s, dob=%s, phoneNumber=%s, accountNumber=%s, password=%s, balance=%s]",
				id, name, email, dob, phoneNumber, accountNumber, password, balance);
	}

	
}
