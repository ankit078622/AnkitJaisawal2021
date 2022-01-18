package com.example.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	/**
	 * Declared attributes of employee
	 */
	private Integer empId;
	private String firstName;
	private String lastName;
	private Integer employeeAge;
}
