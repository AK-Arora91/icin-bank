package org.teksystems.icin_bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.teksystems.icin_bank.model.User;

@Repository(value="userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findUserByAccountNumberAndPassword(String accountNumber,String password);
	
	@Modifying
	@Query("update User u set u.balance =u.balance + ?2 where u.accountNumber = ?1")
	int setUserInfoByAccountNumber(String accountNumber, Long balance);

	User findUserByAccountNumber(String accountNumber);
}
