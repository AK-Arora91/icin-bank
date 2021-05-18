package org.teksystems.icin_bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.teksystems.icin_bank.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="adminLogin",method=RequestMethod.POST)
    public String adminLogin(ModelMap map) {
        return "AdminHome";
    }
	
}
