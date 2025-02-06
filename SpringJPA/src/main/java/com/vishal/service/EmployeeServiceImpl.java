package com.vishal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vishal.entity.Employee;
import com.vishal.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired	
	@Qualifier("impl2")
	EmployeeRepository employeeRepo;
	public List<Employee> loadAllEmployees() {
		System.out.println("EmployeeService : loadAllEmployees() invoked...");
		List<Employee> listOfEmps =  employeeRepo.getEmployees();
		if(listOfEmps.isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		return listOfEmps;
	}

}
