package com.hibernate.services;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate1.util.HibernateUtil;
import com.mysql.cj.Session;

import com.hibernate.Employee;


public class EmployeeService {

	static SessionFactory sessionFactoryObj;
	static org.hibernate.Session sessionObj;
	
	/*------------------------Post request--------------------------------------*/
	/* Method to CREATE an employee in the database business logic */
	public Integer addEmployee(String firstName, String lastName, int salary) {
		
		Transaction transaction=null;
		Integer employeeDetails=null;
		
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Employee employee=new Employee(firstName, lastName, salary);// created the object of employee class
			employeeDetails=(Integer)sessionObj.save(employee);// save the object or insert the recording
			transaction.commit();// explictiy call the commit esure that auto commite should be false
			
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
		return employeeDetails;
	}
	
	/*----------------------------------GET request----------------------------------------*/
	public void ListAllEmployee() {
		
		System.out.println(" *************from inside  ListAllEmployee()**********************  ");
		Transaction transaction=null;
		
		try {
			
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			//Retrieve logic
			List employees=sessionObj.createQuery("From Employee").list();// select * from employee: "Employee refer
			
			Iterator iterator=employees.iterator();
			while(iterator.hasNext()) {
				Employee employee1=(Employee) iterator.next();
				System.out.println("First name "+employee1.getFirstName());
				System.out.println("Last name "+employee1.getLastName());
				System.out.println("Salary "+employee1.getSalary());
			}
			transaction.commit();
			
		}
		catch(HibernateException e) {
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}	
		
		/*---------------------------------UPDATE---------------------------------------*/
		/*------------------------------PUT request id------------------------------------------------------*/
		/*Method to update an employee in the database business logic*/
		public void updateEmployeeDetails(Integer EmployeeId,int salary) {
			System.out.println("**************************from inside updateEmployeeDetails()******************************");
			Transaction transaction=null;
			try {
				sessionObj=HibernateUtil.buildSessionFactory().openSession();
				transaction=sessionObj.beginTransaction();
				
				//update logic
				Employee employee=(Employee) sessionObj.get(Employee.class, EmployeeId);
				employee.setSalary(salary);
				sessionObj.update(employee);// hibernate will form update query automatically
				System.out.println("Update sucessfully");
				transaction.commit();// explictiy call the commit esure that auto commite should be false
	
			}
			catch(HibernateException e) {
				if(transaction!=null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			finally {
				sessionObj.close();
			}
		}
		
		/*-----------------------------------DELETE-----------------------------------------------*/
		/*--------------------------------Put request id---------------------------------------------------------*/

		/*Method for delete employee record*/
		public void deleteEmployeeById(Integer EmnployeeId, int salary) {
			
			System.out.println("********************from inside  deleteEmployeeDetailsById()***********************");
			Transaction transaction=null;
			try {
				sessionObj=HibernateUtil.buildSessionFactory().openSession();
				transaction=sessionObj.beginTransaction();
				Employee employee=(Employee) sessionObj.get(Employee.class,EmnployeeId);
				employee.setSalary(salary);
				sessionObj.delete(employee);// hibernate will form delete query automatically
				System.out.println("deleted sucessfully..."+employee.getId());;
                transaction.commit();// explictiy call the commit esure that auto commite should be false                
				
			}
			catch(HibernateException e) {
				if(transaction!=null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
			finally {
				sessionObj.close();
			}
			
			
		}
		
}
