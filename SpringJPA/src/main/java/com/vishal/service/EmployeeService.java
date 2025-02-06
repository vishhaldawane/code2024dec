package com.vishal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vishal.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> loadAllEmployees();
}
