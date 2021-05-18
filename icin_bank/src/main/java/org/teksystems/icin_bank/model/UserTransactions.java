package org.teksystems.icin_bank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class UserTransactions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String accountNumber;
	private String action;
	private Long amount;
	@CreationTimestamp
	private Date date;
	private Long balance;
	
	public UserTransactions() {
		super();
	}

	public UserTransactions(String accountNumber, String action, Long amount, Long balance) {
		super();
		this.accountNumber = accountNumber;
		this.action = action;
		this.amount = amount;
		this.balance = balance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("UserTransactions [id=%s, accountNumber=%s, action=%s, amount=%s, date=%s, balance=%s]",
				id, accountNumber, action, amount, date, balance);
	}
	
}
