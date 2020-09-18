package com.bsh.assignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsh.assignment.entity.User;


@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject the sessionFactory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public User getUser(String check_email, String check_pass) {
		
		// get current sesion
		Session session = sessionFactory.getCurrentSession();
		
		List<User> userList = null;
		// ONLY search if it's not null
		if (check_email != null && check_pass != null 
				&& check_email.trim().length() > 0 )
		{
			// create a query
			Query<User> q = session.createQuery("from User u where u.email='"+check_email.trim()
					+"' and u.password='"+check_pass + "'", User.class);
			
			// execute query & get results
			userList = q.getResultList();
		
			
			if(userList.size() == 1)
				return(userList.get(0));
			else
				return(null);
		}
		else
			return null;
	}

}
