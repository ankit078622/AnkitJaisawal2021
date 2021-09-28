package com.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainClass {

	public static void main(String args[]) {
		StandardServiceRegistry standardServiceRegistryObj=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistryObj).getMetadataBuilder().build();
		
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Student student=new Student();
		Laptop laptop=new Laptop();
	}
}
