package com.vishal.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vishal.entity.Employee;

@Repository
public interface EmployeeRepository {

	List<Employee> getEmployees(); 
}
