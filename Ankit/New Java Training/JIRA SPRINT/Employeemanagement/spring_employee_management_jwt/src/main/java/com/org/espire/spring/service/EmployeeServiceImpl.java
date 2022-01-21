package com.org.espire.spring.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.org.espire.spring.model.Employee;
import com.org.espire.spring.model.request.EmployeeCreateRequest;
import com.org.espire.spring.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//Business logic
	//Injecting the dependencies 
	@Autowired
	EmployeeRepository empRepository;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	//to create a new employee and read employee by username
	public Employee readByUsername(String username) {
		return empRepository.findByUsername(username).orElseThrow(EntityNotFoundException::new);
	}

	//create
	public void createEmployee(EmployeeCreateRequest empCreateRequest) {
		Employee emp = new Employee();
		Optional<Employee> byUsername = empRepository.findByUsername(empCreateRequest.getUsername());
		emp.setName(null);
		emp.setUsername(empCreateRequest.getUsername());
		emp.setPassword(passwordEncoder.encode(empCreateRequest.getPassword()));	
		empRepository.save(emp);
	}

	//add
	@Override
	public Employee addEmployee(Employee employee) {
		Employee empDetails = empRepository.save(employee);
		return empDetails;
	}

	//get
	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> empById = empRepository.findById(id);
		Employee emp=empById.get();
		return emp;
	}

	//delete
	@Override
	public void deleteEmployeeById(Integer id) {
		empRepository.deleteById(id);

	}

	//update
	@Override
	public Employee updateEmployeeById(Integer id, Employee employee) {
		Optional<Employee> empUpdate = empRepository.findById(id);
		Employee emp=empUpdate.get();
		if (employee.getId() == emp.getId()) {
			updateEmployee(employee);
		}
		return emp;
	}

	private Employee updateEmployee(Employee employeeDetails) {
		Employee empDetail = empRepository.save(employeeDetails);
		return empDetail;
	}
}
