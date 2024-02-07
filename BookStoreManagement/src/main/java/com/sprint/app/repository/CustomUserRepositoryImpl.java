package com.sprint.app.repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.sprint.app.entity.User;

public class CustomUserRepositoryImpl implements CustomUserRepository{

	@Autowired
	EntityManager enityManager;
	
	@Override
	public User getByName(String userName) {
		
		Session session=enityManager.unwrap(Session.class);
		
		String queryString ="from User u where u.userName=:userName";
		
		Query<User> query=session.createQuery(queryString);
		query.setString("userName",userName);
		
		User u=query.getSingleResult();
		return u;			
		
	}

	@Override
	public List<User> getByArea(String area) {
		
		Session session=enityManager.unwrap(Session.class);
		
		String queryString ="from User u where u.address.area=:area";
		
		Query<User> query=session.createQuery(queryString);
		query.setString("area",area);
		
		List<User> userList=query.getResultList();
		return userList;
	}

	@Override
	public List<User> getByCity(String city) {
		
		Session session=enityManager.unwrap(Session.class);
		
		String queryString ="from User u where u.address.city=:city";
		
		Query<User> query=session.createQuery(queryString);
		query.setString("city",city);
		
		List<User> userList=query.getResultList();
		return userList;
		
	}
	
	

}
