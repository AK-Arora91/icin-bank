package org.teksystems.icin_bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teksystems.icin_bank.model.Admin;
import org.teksystems.icin_bank.repository.AdminRepository;

@Service(value = "adminService")
public class AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Transactional
	public List<Admin> getAdmin() {
		return adminRepository.findAll();
	}

	@Transactional
	public Admin saveAdmin(Admin theAdmin) {
		return adminRepository.save(theAdmin);
	}

	@Transactional
	public Admin getAdmin(Integer theId) {
		return adminRepository.findById(theId).get();
	}

	@Transactional
	public void deleteAdmin(Integer theId) {
		adminRepository.deleteById(theId);
	}
	
}