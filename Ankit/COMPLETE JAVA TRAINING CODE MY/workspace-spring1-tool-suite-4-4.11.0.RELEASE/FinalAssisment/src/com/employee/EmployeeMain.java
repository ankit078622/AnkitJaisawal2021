package com.employee;

import java.util.ArrayList;

class Employee {
	int  id;
	private String name;
	private String addrs;
	private int sal;
	public Employee(int id, String name, String addrs, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
		this.sal = sal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		
		employees.add(new Employee(1,"Ankit","Rasra",50000));
		employees.add(new Employee(2,"Rahul","Rasra",50000));
		employees.add(new Employee(3,"Ankit","Rasra",50000));
		employees.add(new Employee(4,"Ankit","Rasra",50000));
		
		for(Employee employee: employees) {
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getAddrs());
			System.out.println(employee.getSal());
		}
	}
}