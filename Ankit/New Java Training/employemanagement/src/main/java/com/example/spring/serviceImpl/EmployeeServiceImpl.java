package com.example.spring.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring.model.Employee;
import com.example.spring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public static HashMap<Integer, Employee> employeeMap;

	/**
	 * Default constructor t
	 */
	public EmployeeServiceImpl() {
		super();
		if (employeeMap == null) {
			employeeMap = new HashMap<Integer, Employee>();
			employeeMap.put(1, new Employee(1, "Rahul", "Sharma", 25));
			employeeMap.put(2, new Employee(2, "Amit", "Sharma", 22));
		}
	}

	/**
	 * Method to get All employee
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>(employeeMap.values());
		return employeeList;
	}

	/**
	 * Method to add employee details
	 * 
	 * @return
	 */
	public void addEmployee(Employee employee) {
		employee.setEmpId(getMaxId() + 1);
		employeeMap.put(employee.getEmpId(), employee);
	}

	/**
	 * Method to update employee details
	 * 
	 * @param employee
	 * @return
	 */
	public Employee updateEmployee(Employee employee) {
		return employeeMap.replace(employee.getEmpId(), employee);
	}

	/**
	 * Method for delete employee details
	 * 
	 * @param employeeId
	 */
	public void deleteEmployee(Integer employeeId) {
		employeeMap.remove(employeeId);
	}

	/*
	 * This method is for getting maximum id so we can store new record
	 */
	public static Integer getMaxId() {
		Integer max = 0;
		for (Integer id : employeeMap.keySet()) {
			if (max <= id)
				max = id;
		}
		return max;
	}
}
