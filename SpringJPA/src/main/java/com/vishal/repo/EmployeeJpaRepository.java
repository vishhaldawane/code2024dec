package com.vishal.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vishal.entity.Employee;


					//Responsive					Reactive
@Repository
public interface EmployeeJpaRepository extends CrudRepository<Employee, Integer> {

}
//Spring will develop an implementation class of above
//EmployeeJpaRepository which is also a CrudRepository


interface Reactive {
	void react();
}

interface Responsive extends Reactive
{
	
}

class Student implements Responsive
{
	public void react() {
		
	}
}