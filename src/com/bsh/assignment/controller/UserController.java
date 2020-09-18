package com.bsh.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bsh.assignment.entity.User;
import com.bsh.assignment.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	// inject the DAO into controller
	@Autowired
	private UserService userService; 
	
	
	// show Log in
	@RequestMapping("/showLogIn")
	public String showLogIn()
	{
		return "login-user";
	}
	
	// recieve log in info
	@PostMapping("/loginUser")
	public String loginUser(@RequestParam("check_email") String check_email,
							@RequestParam("check_pass") String check_pass, 
							Model theModel)
	{
		// getting user from DB
		User u_ob = userService.getUser(check_email, check_pass);
		
		// log debug stuffs
		System.out.println(u_ob);
		
		// verifying to proceed to dashboard screen or not
		if(u_ob != null)
		{
			theModel.addAttribute("user_ob", u_ob);
			return "dashboard-user";
		}
		else
		{
			String error_msg = "User NOT found! Please enter Correct Email & Password.";
			theModel.addAttribute("error_msg", error_msg);
			return "login-user";
		}
	}

}
