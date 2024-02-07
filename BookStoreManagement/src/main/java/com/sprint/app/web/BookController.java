package com.sprint.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sprint.app.entity.Book;
import com.sprint.app.service.IBookService;

@RestController
@CrossOrigin(origins = {"http://localhost:8099", "http://localhost:4200"},allowedHeaders = "*")
@RequestMapping("/bookstore")
public class BookController {
	
	@Autowired
	IBookService bookService;

	@GetMapping("/book")
	public Book getBook(@RequestParam int isbn) {
		
		return bookService.getBook(isbn);
	}
	
	@PostMapping("/book")
	public boolean addBook(@RequestBody Book b) {
		
		return bookService.addBook(b);
	}
	
	@GetMapping("/allbooks")
	public List<Book> listAllBook(){
		
		return bookService.listAllBooks();
	}
	
	
	@GetMapping("/price")
	public List<Book> bookByPrice(@RequestParam double price)
	{
		return bookService.listBooksByPrice(price);
	}
	
	
	@GetMapping("/category")
	public List<Book> bookByCategory(@RequestParam String category){
		
		return bookService.listBooksByCategory(category);
	}
	
	@GetMapping("/rating")
	public List<Book> bookByRating(@RequestParam float rating){
		
		return bookService.listBooksByRating(rating);
	}
	
	@DeleteMapping("/book")
	public boolean deleteBook(@RequestParam int isbn) {
		
		return bookService.deleteBook(isbn);
		
	}
	
	@PutMapping("/book")
	public Book updateBook(@RequestBody Book b,@RequestParam int isbn) {
	
		return bookService.update(b);
		
	}
}
