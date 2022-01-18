package org.espire.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	/**
	 * Declared attributes of employee
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_Id")
	private Integer empId;
	
	@Column(name="first_Name")
	private String firstName;
	
	@Column(name="last_Name")
	private String lastName;
	
	@Column(name="employee_Age")
	private Integer employeeAge;
}
