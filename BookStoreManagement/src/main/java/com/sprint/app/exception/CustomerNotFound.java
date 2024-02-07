package com.sprint.app.exception;

public class CustomerNotFound extends Exception {

	private String message="Customer Not Available , Please Check Again";

	@Override
	public String toString() {
		return "CustomerNotFound,"+message;
	}
	
	
	
	
}
