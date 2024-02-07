package com.sprint.app.repository;


import org.springframework.data.repository.CrudRepository;

import com.sprint.app.entity.OrderDetails;

public interface IOrderRepository extends CrudRepository<OrderDetails, Integer>{

	

		
}
