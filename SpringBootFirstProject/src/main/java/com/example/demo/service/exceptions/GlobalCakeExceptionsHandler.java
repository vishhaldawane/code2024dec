package com.example.demo.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalCakeExceptionsHandler {

	GlobalCakeExceptionsHandler() {
		System.out.println("GlobalCakeExceptionsHandler() ctor....");
	}
	
	@ExceptionHandler(value = CakeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody ErrorResponse cakeNotFoundHandler(CakeNotFoundException ex)
	{	
		System.out.println("cakeNotFoundHandler() invoked....");
		return new ErrorResponse( HttpStatus.NOT_FOUND.value(), ex.getMessage());
	}
	
	
	@ExceptionHandler(value = CakeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	@ResponseBody ErrorResponse cakeAlreadyExistHandler(CakeAlreadyExistsException ex)
	{	
		System.out.println("cakeAlreadyExistHandler() invoked....");
		return new ErrorResponse( HttpStatus.CONFLICT.value(), ex.getMessage());
	}
}
