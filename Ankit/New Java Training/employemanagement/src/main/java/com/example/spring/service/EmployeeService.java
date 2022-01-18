package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	void addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Integer employeeId);
}
