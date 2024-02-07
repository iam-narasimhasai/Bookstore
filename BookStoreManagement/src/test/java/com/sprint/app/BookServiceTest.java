package com.sprint.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint.app.service.*;
import com.sprint.app.entity.*;
@SpringBootTest
public class BookServiceTest {
	@Mock
	IBookService bookservice;
	
	@Test
	void getBooktest()
	{
		Book book=new Book();
		when(bookservice.getBook(1234)).thenReturn(book);
		assertEquals(book,bookservice.getBook(1234));
	}
	@Test
	void viewBook()
	{
		Book book=new Book();
		when(bookservice.viewBook("String")).thenReturn(book);
		assertEquals(book,bookservice.viewBook("String"));
		
	}

}
