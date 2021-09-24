package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.services.EmployeeService;

public class ManageEmployee {

	public static void main(String args[]) {
		EmployeeService employeeService=new EmployeeService();
		
		/* Add few employee records in database */
	    Integer empID1 = employeeService.addEmployee("anshul", "kumar", 1000);// asssinged values from here
		Integer empID2 = employeeService.addEmployee("ankit1", "kumar", 50000);// asssinged values from here
		
		List<Integer> listinfo=new ArrayList<Integer>();
		
		listinfo.add(empID1);
		listinfo.add(empID2);
		if(listinfo.size()!=0) {
			System.out.println("******************************************Inserted********************************************");
		}
		else {
			System.out.println("############################Not Inserted########################################");
		}
		
		/*List employee records in databse*/
		try {
			employeeService.ListAllEmployee();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		/*Update employee records in database*/
		try {
			employeeService.updateEmployeeDetails(8, 555);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		/* delete employee records in database by id */
		try {
			employeeService.deleteEmployeeById(8, 555);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
