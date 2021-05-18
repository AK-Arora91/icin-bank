package org.teksystems.icin_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.teksystems.icin_bank.service.UserTransactionsService;

@Controller
public class UserTransactionsController {

	@Autowired
	UserTransactionsService userTransactionService;
	
}
