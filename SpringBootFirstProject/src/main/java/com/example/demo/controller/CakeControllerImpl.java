package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cake;
import com.example.demo.service.CakeService;
import com.example.demo.service.exceptions.CakeAlreadyExistsException;
import com.example.demo.service.exceptions.CakeNotFoundException;
import com.example.demo.service.exceptions.ErrorResponse;

@RestController
@RequestMapping("/cakes")
public class CakeControllerImpl implements CakeController {

	@Autowired
	CakeService cakeService;
	
	
	// localhost:8080/cakes/1
	
	@GetMapping("/{cakeId}")
	public Cake getCake(@PathVariable int cakeId) {
		System.out.println("CakeController: getCake(cakeId) invoked...");
		return cakeService.getCake(cakeId);
		
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
	
	
	// localhost:8080/cakes/add  - pass the body of the Cake
	@PostMapping("/add")
	public String addCake(@RequestBody Cake newCake) {
		System.out.println("CakeController: addCake(Cake) invoked...");
		return cakeService.addCake(newCake);
	}
	
	// localhost:8080/cakes/update - pass the body of the Cake
	@PutMapping("/update")
	public String updateCake(@RequestBody Cake existingCake) {
		System.out.println("CakeController: updateCake(Cake) invoked...");
		return cakeService.updateCake(existingCake);
	}
	
	// localhost:8080/cakes/delete - pass the body of the Cake
	@DeleteMapping("/delete")
	public void deleteCake(@RequestBody Cake existingCake) {
		System.out.println("CakeController: deleteCake(Cake) invoked...");
		cakeService.deleteCake(existingCake);
	}
	
	// localhost:8080/cakes/deleteById/5 - NO BODY OF CAKE
	@DeleteMapping("/deleteById/{cakeId}")
	public void deleteCakeById(@PathVariable int cakeId) {
		System.out.println("CakeController: deleteCake(int) invoked...");
		cakeService.deleteCakeById(cakeId);
	}
	
	// http://localhost:8080/cakes/greet
	@GetMapping("/greet")
	String greeting() {
		
		return "Welcome to Cake Example";
	}
	
	@GetMapping("/cost/{amt}") //URL names must be unique
	List<String> getCakeByCost(@PathVariable float amt) {
			System.out.println("CakeController: getCakeByCost() invoked...");
			return cakeService.getCakeNamesByCost(amt);
	}
	
	@GetMapping("/weight/{wt}") //URL names must be unique
	List<Float> getCakeByWeight(@PathVariable float wt) {
			System.out.println("CakeController: getCakeByWeight() invoked...");
			return cakeService.getCostByCakeWeight(wt);
	}
	
	@GetMapping("/all")
	List<Cake> getAllCakes() {
		System.out.println("CakeController: getAllCakes() invoked...");
		return cakeService.getAllCakes();
	}
	
	
}

// http://localhost:8080/cakes/greet
// http://localhost:8080/cakes/cost/500












/*

	@GetMapping("/weight/{w}")
	String greeting(@RequestParam("w") float w) 
	{
		
		return null;
	}
	
// Exception Handler method added in CustomerController to handle CustomerAlreadyExistsException
@ExceptionHandler(value = CustomerAlreadyExistsException.class)
@ResponseStatus(HttpStatus.CONFLICT)
public ErrorResponse handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex) {
    return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
}
// Class to handle exceptions globally
package com.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NoSuchCustomerExistsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorResponse handleException(NoSuchCustomerExistsException ex) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
}


*/