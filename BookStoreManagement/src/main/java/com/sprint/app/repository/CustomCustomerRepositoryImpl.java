package com.sprint.app.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;
import com.sprint.app.entity.User;

@Repository
public class CustomCustomerRepositoryImpl implements CustomCustomerRepository{
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Customer> getCustomerByDate(Date date) {
        Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Customer cus where b.registerOn=:date";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setDate("registerOn",date);
		
		List<Customer> list = query.getResultList();
		return list;
	}

	@Override
	public Customer getCustomerByName(String name) {
         Session session=entityManager.unwrap(Session.class);
		
		String queryString ="from Customer cus where cus.fullname=:name";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setString("fullname",name);
		
		 Customer cus=query.getSingleResult();
		return cus;	
		}

	@Override
	public Customer getCustomerByPhoneNumber(long number) {

       Session session=entityManager.unwrap(Session.class);
		
		String queryString ="from Customer cus where cus.mobileNumber=:number";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setLong("mobileNumber",number);
		
		 Customer cus=query.getSingleResult();
		return cus;	
	}

	




}
