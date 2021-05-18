package org.teksystems.icin_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.teksystems.icin_bank.service.UserTransactionsService;

@Controller
public class HomeController {

	@Autowired
	UserTransactionsService userTransactionsService;
	
	@RequestMapping("/")
    public String home() {
        return "home";
    }
	
	@RequestMapping("/HomeBackground")
    public String homeBackground() {
        return "HomeBackground";
    }
	
	@RequestMapping("/UserLogin")
    public String userLogin() {
        return "UserLogin";
    }
	
	@RequestMapping("/UserRegistration")
    public String userRegistration() {
        return "UserRegistration";
    }
	
	@RequestMapping("/DepositMoney")
    public String depositMoney() {
        return "DepositMoney";
    }
	
	@RequestMapping("/WithdrawMoney")
    public String withdrawMoney() {
        return "WithdrawMoney";
    }
	
	@RequestMapping("/TransferFunds")
    public String transferFunds() {
        return "TransferFunds";
    }
	
	@RequestMapping("/RequestChequeBook")
    public String requestChequeBook(ModelMap map) {
        return "RequestChequeBook";
    }
	
	@RequestMapping(value="UserTransactions",method=RequestMethod.GET)
    public String userTransactions(@RequestParam("account-number")String accountNumber,
    		ModelMap map) {
		
		map.addAttribute("userTransactions", userTransactionsService.getUserTransactions(accountNumber));
        
		return "UserTransactions";
    }
}
