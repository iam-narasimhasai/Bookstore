package com.sprint.app.dto;

import java.util.List;

import com.sprint.app.entity.Book;

import lombok.Data;


@Data
public class OrderDTO {
	
	private int orderId;
	private int quantity;
	private List<Book> OrderedBooks;
}
