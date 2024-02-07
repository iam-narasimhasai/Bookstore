package com.sprint.app.repository;

import java.util.Date;
import java.util.List;
import com.sprint.app.entity.Customer;

public interface CustomCustomerRepository {
	
	public List<Customer> getCustomerByDate(Date date);
    public Customer getCustomerByName(String name);
    public Customer getCustomerByPhoneNumber(long number);
}
