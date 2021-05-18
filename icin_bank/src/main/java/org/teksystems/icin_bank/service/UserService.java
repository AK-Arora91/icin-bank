package org.teksystems.icin_bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teksystems.icin_bank.model.User;
import org.teksystems.icin_bank.repository.UserRepository;

@Service(value="userService")
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Transactional
	public boolean saveUser(User theUser) {
		return userRepository.save(theUser)!=null;
	}

	@Transactional
	public User getUser(Integer id) {
		return userRepository.findById(id).get();
	}

	@Transactional
	public void deleteUser(Integer theId) {
		userRepository.deleteById(theId);
	}
	
	@Transactional
	public User getUser(String accountNumber, String password) {
		return userRepository.findUserByAccountNumberAndPassword(accountNumber, password);
	}
	
	@Transactional
	public boolean updateUserBalance(String accountNumber,Long balance) {
		int u=userRepository.setUserInfoByAccountNumber(accountNumber, balance);
		return u>0;
		
	}
}
