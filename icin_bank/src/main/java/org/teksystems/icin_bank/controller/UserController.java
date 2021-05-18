package org.teksystems.icin_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.teksystems.icin_bank.model.User;
import org.teksystems.icin_bank.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="UserRegister",method =RequestMethod.POST)
	public String userRegister(@RequestParam("name")String name,
			@RequestParam("email")String email,@RequestParam("dob")String dob,
			@RequestParam("phone-number")String phoneNumber,@RequestParam("account-number")String accountNumber,
			@RequestParam("password")String password,ModelMap map) {
		
		if(userService.saveUser(new User(name,email,dob,phoneNumber,accountNumber,password)))
			map.addAttribute("message","User Registered");
		else
			map.addAttribute("message","Invalid Details For Registration");
		
		return "UserLogin";
	}
	
	@RequestMapping(value="UserPage",method=RequestMethod.POST)
	public String userPage(@RequestParam("account-number")String accountNumber,
			@RequestParam("password")String password,ModelMap map) {
		
		User user=userService.getUser(accountNumber,password);
		if(user!=null) {
			map.addAttribute("user", user);
			return "home";
		}
		else
			map.addAttribute("message", "Invalid Details");
		return "home";
	}
	
	@RequestMapping(value="UserBalance",method=RequestMethod.GET)
	public String userBalance(@RequestParam("id")Integer id,ModelMap map) {
		User user=userService.getUser(id);
		map.addAttribute("balance",user.getBalance());
		return "UserBalance";
	}
	
	@RequestMapping(value="Deposit",method =RequestMethod.POST)
	public String depositMoney(@RequestParam("account-number")String accountNumber,
			@RequestParam("amount")Long amount,ModelMap map) {
		if(userService.updateUserBalance(accountNumber, amount)) {
			map.addAttribute("message","Amount Deposited Successfully");
		}
		else
			map.addAttribute("message","Invalid Details");
			
		return "DepositMoney";
	}
	
	@RequestMapping(value="Withdraw",method =RequestMethod.POST)
	public String withdrawMoney(@RequestParam("account-number")String accountNumber,
			@RequestParam("amount")Long amount,ModelMap map) {
		if(userService.updateUserBalance(accountNumber, -amount)) {
			map.addAttribute("message","Amount Withdrawn Successfully");
		}
		else
			map.addAttribute("message","Invalid Details");
			
		return "DepositMoney";
	}
	
	@RequestMapping(value="transferFunds",method =RequestMethod.POST)
	public String transferMoney(@RequestParam("account-number1")String accountNumber1,
			@RequestParam("account-number2")String accountNumber2,
			@RequestParam("amount")Long amount,ModelMap map) {
		if(userService.updateUserBalance(accountNumber1, -amount)&&userService.updateUserBalance(accountNumber2,amount)) {
			map.addAttribute("message","Amount Transfer Successfully");
		}
		else
			map.addAttribute("message","Invalid Details");
			
		return "TransferFunds";
	}
	
	@RequestMapping("/requestChequeBook")
    public String requestChequeBook(ModelMap map) {
		map.addAttribute("message", "Cheque book will be delivered at your home within 1 month");
        return "RequestChequeBook";
    }
}
