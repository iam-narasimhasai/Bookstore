package com.sprint.app.dto;

import org.springframework.stereotype.Component;

import com.sprint.app.entity.Customer;

@Component
public class CustomerDTOConverter {
	
	public CustomerDTO getCustomerBasicInfo(Customer customer)
	{ 
		CustomerDTO custDto=new CustomerDTO();
		custDto.setCustomerId(customer.getCustomerId());
		custDto.setEmail(customer.getEmail());
		custDto.setFullName(customer.getEmail());
		custDto.setMobileNumber(customer.getMobileNumber());
		return custDto;
		
	}
	

}
