package com.org.espire.spring.service;

import com.org.espire.spring.model.Employee;
import com.org.espire.spring.model.request.EmployeeCreateRequest;

public interface EmployeeService {
	
	//create
	void createEmployee(EmployeeCreateRequest empCreateRequest);

	// add
	Employee addEmployee(Employee employee);

	// get
	Employee getEmployeeById(Integer id);

	// Delete
	void deleteEmployeeById(Integer id);

	// Update
	Employee updateEmployeeById(Integer id, Employee employee);

}
