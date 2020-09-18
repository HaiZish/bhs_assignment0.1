package com.bsh.assignment.service;

import com.bsh.assignment.entity.User;

public interface UserService 
{
	public User getUser(String check_email, String check_pass);
}
