package org.teksystems.icin_bank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class GrantAccess {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String accountNumber;
	private String action;
	@CreationTimestamp
	private Date date;
	private Long amount;
	private Long currentBalance;
	private String access="pending";
	
	public GrantAccess() {
		super();
	}

	public GrantAccess(String accountNumber, String action, Long amount, Long currentBalance) {
		super();
		this.accountNumber = accountNumber;
		this.action = action;
		this.amount = amount;
		this.currentBalance = currentBalance;
	}

	public GrantAccess(String accountNumber, String action) {
		super();
		this.accountNumber = accountNumber;
		this.action = action;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Long currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	@Override
	public String toString() {
		return String.format(
				"GrantAccess [id=%s, accountNumber=%s, action=%s, date=%s, amount=%s, currentBalance=%s, access=%s]",
				id, accountNumber, action, date, amount, currentBalance, access);
	}

	
}
