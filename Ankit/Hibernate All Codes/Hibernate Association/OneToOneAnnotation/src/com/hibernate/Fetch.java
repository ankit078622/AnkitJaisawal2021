package com.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Fetch {

	public static void main(String args[]) {
		
		StandardServiceRegistry standardServiceRegistryObj1=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(standardServiceRegistryObj1).getMetadataBuilder().build();
		
		SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		System.out.println("Fetching Records from the databse espiredatabse ");
		TypedQuery typedQuery=session.createQuery("from Employee employee");
		List<Employee> list=typedQuery.getResultList();
		Iterator<Employee> iterator=list.iterator();
		while(iterator.hasNext()) {
			Employee emp=iterator.next();
			System.out.println(emp.getEmployeeId()+" "+emp.getName()+" "+emp.getEmail());
			Address address=emp.getAddress();
			System.out.println(address.getAddressLine1()+" "+address.getCity()+" "+
			address.getState()+" "+address.getCountry()+" "+address.getPincode());
			
			
		}
		
		
	}
}
