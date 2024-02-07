package com.sprint.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.sprint.app.entity.Book;

@Service
public interface IBookService {
	
	public boolean addBook(Book b);
	public List<Book> listAllBooks();
	public boolean deleteBook(int isbn);
	public Book getBook(int isbn);
	public Book viewBook(String name);
	public List<Book> listBooksByCategory(String cat);
	public List<Book> listBooksByPrice(double price);
	public List<Book> listBooksByRating(float rating);
	public Book update(Book b);

}
