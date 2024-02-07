package com.sprint.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class OrderDetails {
	
	
	@Id
	private int orderId;
	private int customerId;
	private int quantity;
	private String customerName;
	private double totalPrice;
	private long customerMobile;
	private String orderStatus;
	
}
