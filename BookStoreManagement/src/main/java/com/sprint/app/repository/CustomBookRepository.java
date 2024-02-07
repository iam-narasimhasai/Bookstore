package com.sprint.app.repository;

import java.util.List;
import com.sprint.app.entity.Book;

public interface CustomBookRepository {
	
	public Book viewBook(String name);
	public List<Book> listBooksByCategory(String cat);
	public List<Book> listBooksByPrice(double price);
	public List<Book> listBooksByRating(float rating);

}
