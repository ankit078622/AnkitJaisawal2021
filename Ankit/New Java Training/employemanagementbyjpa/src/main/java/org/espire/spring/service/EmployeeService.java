package org.espire.spring.service;

import java.util.List;

import org.espire.spring.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(Integer employeeId);
}
