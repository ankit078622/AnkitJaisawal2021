package com.hibernate.eazerlazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App {

	public static void main(String args[]) {
		
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		
		Alien a1=session.get(Alien.class, 1);
		Collection<Laptop> laps=a1.getLaps();
		
		for(Laptop l: laps) {
			System.out.println(l);
		}
		
	//	System.out.println("hi");
		session.getTransaction().commit();
	}
}
