package com.bsh.assignment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsh.assignment.dao.UserDAO;
import com.bsh.assignment.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	// need to inject user DAO
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public User getUser(String check_email, String check_pass) {
		return userDAO.getUser(check_email, check_pass);
	}

}
