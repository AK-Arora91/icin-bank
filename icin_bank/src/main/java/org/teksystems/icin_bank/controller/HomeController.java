package org.teksystems.icin_bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
}
