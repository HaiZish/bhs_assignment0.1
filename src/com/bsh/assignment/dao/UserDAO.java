package com.bsh.assignment.dao;

import com.bsh.assignment.entity.User;

public interface UserDAO
{
	public User getUser(String check_email, String check_pass);
}
