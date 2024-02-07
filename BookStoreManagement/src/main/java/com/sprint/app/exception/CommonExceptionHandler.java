package com.sprint.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorTemplate> handlerForException(BookNotFoundException exp)
	{
		ErrorTemplate template = new ErrorTemplate();
		
		template.setErrorMsg(exp.toString());
		template.setActionType("Book Creation/ Updation");
		
		return new ResponseEntity<ErrorTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler
	public void handlerForNullPointerException(NullPointerException exp)
	{
		// this code executes whenever Null Pointer Exce raised
	}
	
	@ExceptionHandler
	public void handlerForPanNumber(OrderNotFoundException exp)
	{
		// this code executes whenever Order not Found Exce raised
	}
	
	@ExceptionHandler
	public void handlerForIFSCCodeException(CustomerNotFound exp)
	{
		// this code executes whenever Customer Not Found Exce raised
	}
}
