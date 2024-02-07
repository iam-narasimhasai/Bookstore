package com.sprint.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.sprint.app.entity.Customer;
import com.sprint.app.service.CustomerServiceImpl;

@SpringBootTest
public class CustomerTest {
	@Mock
	CustomerServiceImpl customerservice;
	
	@Test
	void getCustomerByPhonetest() {
		Customer customer=new Customer();
		when(customerservice.getCustomerByPhoneNumber(1234567890)).thenReturn(customer);
		assertEquals(customer,customerservice.getCustomerByPhoneNumber(1234567890));
	} 
	
	@Test
	void getCustomerByNametest() {
		Customer customer=new Customer();
		when(customerservice.getCustomerByName("Nagoor")).thenReturn(customer);
		assertEquals(customer,customerservice.getCustomerByName("Nagoor"));
	} 
	@Test
	void viewCustomertest() 
	{
		Customer customer1=new Customer();
		customer1.setCustomerId(123);
		when(customerservice.viewCustomer(123)).thenReturn(customer1);
		assertEquals(customer1, customerservice.viewCustomer(123));
	}
	@Test
	void getCustomerByPhoneNumbertest() 
	{
		Customer customer2=new Customer();
		when(customerservice.getCustomerByPhoneNumber(12322554)).thenReturn(customer2);
		assertEquals(customer2, customerservice.getCustomerByPhoneNumber(12322554));
	}
    @Test
    void listCustomerstest()
    {
    		Customer customer1=new Customer();
    		Customer customer2=new Customer();
    		ArrayList<Customer> customer=new ArrayList<Customer>();
    		customer.add(customer1);
    		customer.add(customer2);
    		when(customerservice.listCustomers()).thenReturn(customer);
    		assertEquals(customer,customerservice.listCustomers());
    }
    @Test
    void getCreateCustomertest()
    {
    	Customer customer2=new Customer();
		when(customerservice.createCustomer(any(Customer.class))).thenReturn("Created");
		assertEquals("Created", customerservice.createCustomer(customer2));
    }
    @Test
    void deleteCustomerTest()
    {
    	Customer customer=new Customer();
		customer.setCustomerId(123);
		when(customerservice.deleteCustomer(123)).thenReturn("deleted");
		assertEquals("deleted", customerservice.deleteCustomer(123));
    }
    @Test
    void  updateCustomer()
    {
    	Customer customer=new Customer();
    	when(customerservice.updateCustomer(customer)).thenReturn("updated");
    	assertEquals("updated", customerservice.updateCustomer(customer));
    	
    }
	
}
