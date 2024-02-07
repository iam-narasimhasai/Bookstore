package com.sprint.app.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;


@Data
@Entity
public class Customer{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	@Email(message="Email should not be empty")
	private String email;
	@NotEmpty(message="Name should not be empty")
	private String fullName;
	private String password;
	private long mobileNumber;
	private LocalDate registerOn;
	
	@Embedded
	private Address address;
	
	
}
