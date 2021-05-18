package org.teksystems.icin_bank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.teksystems.icin_bank.model.GrantAccess;
import org.teksystems.icin_bank.repository.GrantAccessRepository;

@Service(value = "GrantAccessService")
public class GrantAccessService{
	
	@Autowired
	private GrantAccessRepository grantAccessRepository;
	
	@Transactional
	public List<GrantAccess> getGrantAccess() {
		return grantAccessRepository.findAll();
	}

	@Transactional
	public GrantAccess saveGrantAccess(GrantAccess theGrantAccess) {
		return grantAccessRepository.save(theGrantAccess);
	}

	@Transactional
	public GrantAccess getGrantAccess(Integer theId) {
		return grantAccessRepository.findById(theId).get();
	}

	@Transactional
	public void deleteGrantAccess(Integer theId) {
		grantAccessRepository.deleteById(theId);
	}

	public List<GrantAccess> getGrantAccess(String action) {
		return grantAccessRepository.findGrantAccessByAction(action);
	}
	
}