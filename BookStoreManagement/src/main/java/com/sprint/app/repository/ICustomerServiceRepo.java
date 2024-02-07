package com.sprint.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sprint.app.entity.Customer;

public interface ICustomerServiceRepo extends CrudRepository<Customer, Integer>,CustomCustomerRepository {

	

}
