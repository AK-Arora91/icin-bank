package org.teksystems.icin_bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.teksystems.icin_bank.model.Admin;

@Repository(value="adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
}
