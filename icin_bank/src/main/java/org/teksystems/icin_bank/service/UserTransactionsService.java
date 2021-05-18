package org.teksystems.icin_bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teksystems.icin_bank.model.UserTransactions;
import org.teksystems.icin_bank.repository.UserTransactionsRepository;

@Service(value = "userTransactionsService")
public class UserTransactionsService{
	
	@Autowired
	private UserTransactionsRepository userTransactionsRepository;
	
	@Transactional
	public List<UserTransactions> getUserTransactions() {
		return userTransactionsRepository.findAll();
	}

	@Transactional
	public UserTransactions saveUserTransactions(UserTransactions theUserTransactions) {
		return userTransactionsRepository.save(theUserTransactions);
	}

	@Transactional
	public UserTransactions getUserTransactions(Integer theId) {
		return userTransactionsRepository.findById(theId).get();
	}

	@Transactional
	public void deleteUserTransactions(Integer theId) {
		userTransactionsRepository.deleteById(theId);
	}
	
	@Transactional
	public List<UserTransactions> getUserTransactions(String accountNumber) {
		return userTransactionsRepository.getUserTransactionsByAccountNumber(accountNumber);
	}
	
}