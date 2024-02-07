package com.sprint.app.dto;

import com.sprint.app.entity.Customer;

public class CustomerBasicInfoDTOConversion {
	
	public CustomerBasicInfoDTO convertCustomer(Customer c)
	{
		CustomerBasicInfoDTO basic=new CustomerBasicInfoDTO();
		
		 basic.setMobile(c.getMobileNumber());
		 basic.setName(c.getFullName());
		 return basic;
	}
}
