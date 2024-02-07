package com.sprint.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	private int isbn;
	private String title;
	private String author;
	
	
	private String category;
	
	private String description;
	private int quantity;
	private double price;
	private LocalDate publishDate;
	private LocalDate lastUpdatedOn;
	
	
	
}
