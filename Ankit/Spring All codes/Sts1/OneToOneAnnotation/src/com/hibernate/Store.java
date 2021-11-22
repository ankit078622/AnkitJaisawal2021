package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Store {

	public static void main(String args[]) {
		
		StandardServiceRegistry standardServiceRegistryObj=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(standardServiceRegistryObj).getMetadataBuilder().build();
		
		SessionFactory sessionFactoryObj=meta.getSessionFactoryBuilder().build();
		Session session=sessionFactoryObj.openSession();
		
		Transaction transaction=session.beginTransaction();
		//Setting  some values of employee say ravi
		Employee employee=new Employee();
		employee.setName("Ravi Malik");
		employee.setEmail("ravi@gmail.com");
		
		//Setting some values of employee ravi
		Address address1=new Address();
		address1.setAddressLine1("G-21,Lohia nagar");
		address1.setCity("Ghaziabad");
		address1.setState("UP");
		address1.setCountry("India");
		address1.setPincode(201301);
		
		//setting employee to address
		employee.setAddress(address1);
		//insert into db
		session.persist(employee);
		transaction.commit();
		session.close();
		System.out.println("success.............");		
	}
	
}
