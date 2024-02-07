package com.sprint.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.dto.CustomerBasicInfoDTO;
import com.sprint.app.entity.Customer;
import com.sprint.app.repository.ICustomerServiceRepo;


@Service
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerServiceRepo customer;
	
	
	@Override
	public String  createCustomer(Customer c) {
		// TODO Auto-generated method stub
		customer.save(c);
		return "Customer Profile Created";
	}

	@Override
	public List<Customer> listCustomers() {
		List<Customer> custlist=(List<Customer>) customer.findAll();
		
		if(custlist.size()==0) {
			return null;
		}
		return custlist;
	}

	@Override
	public String deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		customer.deleteById(customerId);
		return "Customer Profile Delete";
	}

	@Override
	public String updateCustomer(Customer c) {
		customer.save(c);
		return "Done";
	}

	@Override
	public Customer viewCustomer(int customerid) {
		return customer.findById(customerid).get(); 
	}

	@Override
	public List<Customer> getCustomerByDate(Date date) {
	return customer.getCustomerByDate(date);
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		
		return customer.getCustomerByName(name);
	}

	@Override
	public Customer getCustomerByPhoneNumber(long number) {
		// TODO Auto-generated method stub
		return customer.getCustomerByPhoneNumber(number);
	}

	@Override
	public CustomerBasicInfoDTO getCustomerByOrderId(int id) {
		
		return null;
	}

	/*
	 * @Override public CustomerBasicInfoDTO getCustomerByOrderId(int id) {
	 * 
	 * List<Customer> custlist=(List<Customer>) customer.findAll(); Customer c=new
	 * Customer(); for(int i=0;i<custlist.size();i++) {
	 * 
	 * List<OrderBook> orders=new ArrayList<OrderBook>();
	 * orders=custlist.get(i).getOrdersList();
	 * 
	 * while(orders.size()>=0) { if(orders.get(i).getOrderId()==id) { int
	 * cusId=orders.get(i).getCustomerId(); c=customer.findById(cusId).get(); break;
	 * } }
	 * 
	 * }
	 * 
	 * CustomerBasicInfoDTOConversion conversion =new
	 * CustomerBasicInfoDTOConversion(); return conversion.convertCustomer(c);
	 * 
	 * }
	 */


	

}
