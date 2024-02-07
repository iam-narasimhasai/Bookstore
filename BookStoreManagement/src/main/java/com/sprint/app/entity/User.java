package com.sprint.app.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


import lombok.Data;


@Entity
@Data
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@NotBlank(message = "Name cannot be empty")
	private String userName;
	
	@Embedded
	private Address address;
	
	
	@Min(value =1000000000,message ="Please chech your Number Again")
	private long mobile;
	
	@NotEmpty(message = "Email Should be given")
	private String email;
	
	private String password;

	
}
