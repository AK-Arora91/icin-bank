package org.teksystems.icin_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.teksystems.icin_bank.service.GrantAccessService;
import org.teksystems.icin_bank.service.UserService;

@Controller
public class AdminController {

//	@Autowired
//	private AdminService adminService;
	@Autowired
	private GrantAccessService grantAccessService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="adminLogin",method=RequestMethod.POST)
    public String adminLogin() {
        return "AdminHome";
    }
	
	@RequestMapping(value="GrantAccess",method=RequestMethod.GET)
    public String grantAccess(ModelMap map) {
		map.addAttribute("grantAccess", grantAccessService.getGrantAccess());
        return "GrantAccess";
    }
	
	@RequestMapping(value="request",method=RequestMethod.GET)
    public String acceptRequest(@RequestParam("id")Integer id, ModelMap map) {
		grantAccessService.deleteGrantAccess(id);
		map.addAttribute("grantAccess", grantAccessService.getGrantAccess());
        return "GrantAccess";
    }
	
	@RequestMapping(value="ChequeBookRequests",method=RequestMethod.GET)
    public String chequeBookRequests(ModelMap map) {
		map.addAttribute("chequeBookRequests", grantAccessService.getGrantAccess("chequeBookRequests"));
        return "ChequeBookRequests";
    }
	
	@RequestMapping(value="Users",method=RequestMethod.GET)
    public String getUsers(ModelMap map) {
		map.addAttribute("users", userService.getUsers());
        return "Users";
    }
	
	@RequestMapping(value="blockUser",method=RequestMethod.GET)
    public String blockUser(@RequestParam("id")Integer id, ModelMap map) {
		userService.deleteUser(id);
		map.addAttribute("users", userService.getUsers());
        return "Users";
    }
	
}
