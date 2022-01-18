package org.espire.spring.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.espire.spring.jparepository.EmployeeRepository;
import org.espire.spring.model.Employee;
import org.espire.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// Creating object
	@Autowired
	EmployeeRepository employeeRepository;

	/**
	 * Method for get all the employee list present in the database
	 */
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	/**
	 * Method for add employee details
	 */
	@Override
	public Employee addEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return employee2;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return employee2;
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
