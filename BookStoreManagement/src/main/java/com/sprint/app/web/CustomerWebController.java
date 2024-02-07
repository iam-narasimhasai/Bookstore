package com.sprint.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.app.entity.Customer;
import com.sprint.app.service.ICustomerService;

@RestController
@CrossOrigin(origins = {"http://localhost:8099", "http://localhost:4200"},allowedHeaders = "*")			
@RequestMapping("/customerprofile")
public class CustomerWebController {
	
	@Autowired
	ICustomerService cust;
	
	@PostMapping("/customer")
	public String createCustomer(@RequestBody Customer customer)
	{
		return cust.createCustomer(customer);
	}
	
	@DeleteMapping("/customer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId)
	{
		return cust.deleteCustomer(customerId);
	}
	
	@GetMapping("/customerslist")
	public List<Customer> listCustomers()
	{
		return cust.listCustomers();
	}
	
	@PutMapping("/customer")
	public String updateCustomer(Customer c)
	{
		return cust.updateCustomer(c);
	}
	@GetMapping("/profile")
	public Customer viewCustomer(@RequestParam int id)
	{
		return cust.viewCustomer(id);
	}
	@GetMapping("/customer")
	public Customer getCustomerByName(@RequestParam String name)
	{
		return cust.getCustomerByName(name);
	}

}
