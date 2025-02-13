package com.example.demo.service.exceptions;

//while get,update,delete
public class CakeNotFoundException extends RuntimeException {
	public CakeNotFoundException(String str) {
		super(str);
	}
}
