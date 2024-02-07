package com.sprint.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.sprint.app.entity.Book;


public interface IBookServiceRepo extends CrudRepository<Book, Integer>,CustomBookRepository{


	

	//Custom Repository also has the methods
	
}
