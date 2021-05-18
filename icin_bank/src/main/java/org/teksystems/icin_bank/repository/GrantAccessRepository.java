package org.teksystems.icin_bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.teksystems.icin_bank.model.GrantAccess;

@Repository(value="grantAccessRepository")
public interface GrantAccessRepository extends JpaRepository<GrantAccess, Integer> {

	List<GrantAccess> findGrantAccessByAction(String action);
	
}
