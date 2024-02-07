package com.sprint.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.entity.Book;
import com.sprint.app.repository.IBookServiceRepo;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	IBookServiceRepo bookrepo;

	@Override
	public boolean addBook(Book b) {
		
		bookrepo.save(b);
		return true;
	}

	@Override
	public List<Book> listAllBooks() {
	
		List<Book> bookList=(List<Book>) bookrepo.findAll();
		
		if(bookList.size()==0) {
			return null;
		}
		return bookList;
	}

	@Override
	public boolean deleteBook(int isbn) {
				
		bookrepo.deleteById(isbn);
		return true;
	}

	@Override
	public Book viewBook(String name) {
		
		//Custom Repository need to be added
		return null;
	}

	@Override
	public List<Book> listBooksByCategory(String cat) {
		
		return bookrepo.listBooksByCategory(cat);
	}

	@Override
	public Book getBook(int isbn) {
		
		return bookrepo.findById(isbn).get();
	}


	@Override
	public List<Book> listBooksByPrice(double price) {

		return bookrepo.listBooksByPrice(price);
	}

	@Override
	public List<Book> listBooksByRating(float rating) {
		
		return bookrepo.listBooksByRating(rating);
	}

	@Override
	public Book update(Book b) {
		
		Book bobj=bookrepo.findById(b.getIsbn()).get();
			
		bobj.setIsbn(b.getIsbn());
		bobj.setTitle(b.getTitle());
		bobj.setAuthor(b.getAuthor());
		bobj.setCategory(b.getCategory());
		bobj.setPrice(b.getPrice());
		bobj.setDescription(b.getDescription());
		bobj.setQuantity(b.getQuantity());
		bobj.setPublishDate(b.getPublishDate());
		bobj.setLastUpdatedOn(b.getLastUpdatedOn());
		
			return bookrepo.save(bobj);
	}

	
	
}
