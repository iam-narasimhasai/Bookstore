package com.sprint.app.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sprint.app.entity.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;

@Repository
public class CustomBookRepositoryImpl implements CustomBookRepository{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public Book viewBook(String name) {
	
		Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Book b where b.name=:name";
		
		Query<Book> query=session.createQuery(queryString);
		query.setString("name",name);
		
		Book b=query.getSingleResult();
		return b;
	}

	@Override
	public List<Book> listBooksByCategory(String category) {
		
		Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Book b where b.category=:category";
		
		Query<Book> query=session.createQuery(queryString);
		query.setString("category",category);
		
		List<Book> categoryList = query.getResultList();
		return categoryList;
	}

	@Override
	public List<Book> listBooksByPrice(double price) {
		
		Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Book b where b.price=:price";
		
		Query<Book> query=session.createQuery(queryString);
		query.setDouble("price",price);
		
		List<Book> priceList = query.getResultList();
		return priceList;
	}

	@Override
	public List<Book> listBooksByRating(float rating) {
		
		Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Book b where b.rating=:rating";
		
		Query<Book> query=session.createQuery(queryString);
		query.setFloat("rating",rating);
		
		List<Book> ratingsList= query.getResultList();
		return ratingsList;
	}
}
