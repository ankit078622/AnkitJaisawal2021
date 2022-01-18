package org.espire.spring.controller;

import java.util.List;

import org.espire.spring.model.Employee;
import org.espire.spring.service.EmployeeService;
import org.espire.spring.serviceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	/**
	 * Method to get the employee
	 * 
	 * @return
	 */
	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return employeeService.getAllEmployee();
	}

	/**
	 * Method to add employee in the record
	 * 
	 * @param employee
	 */
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	/**
	 * Method for update the employee details
	 * 
	 * @param employee
	 * @return
	 */
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	/**
	 * Method for delete the employee details
	 * 
	 * @param employeeId
	 */
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
}
