package com.example.demo.service.exceptions;

//while adding
public class CakeAlreadyExistsException extends RuntimeException {
	public CakeAlreadyExistsException(String str) {
		super(str);
	}
}
