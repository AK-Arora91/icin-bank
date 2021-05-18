package org.teksystems.icin_bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.teksystems.icin_bank.model.UserTransactions;

@Repository(value="userTransactionsRepository")
public interface UserTransactionsRepository extends JpaRepository<UserTransactions, Integer> {

	List<UserTransactions> getUserTransactionsByAccountNumber(String accountNumber);
}
