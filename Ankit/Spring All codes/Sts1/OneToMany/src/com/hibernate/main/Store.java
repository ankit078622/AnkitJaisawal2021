package com.hibernate.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entity.Answer;
import com.hibernate.entity.Question;

public class Store {

	public static void main(String args[]) {
		
		StandardServiceRegistry standardServiceRegistryObj=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistryObj).getMetadataBuilder().build();
		
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		//Answer 1
		Answer answer1=new Answer();
		answer1.setAnswername("Java is a programming langusge");
		answer1.setPostedBy("Ravi Malik");
		
		//Answer 2
		Answer  answer2=new Answer();
		answer2.setAnswername("Java is plateform independent");
		answer2.setPostedBy("Sudhir Kumr");
		
		//Answer 3 for question 2
		Answer answer3=new Answer();
		answer3.setAnswername("Servlet is an interface");
	    answer3.setPostedBy("Jai kumar");
	    
	    //Answer 4 for question 2
	    Answer answer4=new Answer();
	    answer4.setAnswername("Servlet is an API");
	    answer4.setPostedBy("Arun");
	    
	    //Adding to list
	    ArrayList<Answer> list1=new ArrayList<Answer>();
	    list1.add(answer1);
	    list1.add(answer2);
	    
	    //Addling to list
	    ArrayList<Answer> list2=new ArrayList<Answer>();
	    list2.add(answer3);
	    list2.add(answer4);
	    
	    /*------------------------------------Question--------------------------------------*/
		//For question number 1
	    Question question1=new Question();
		question1.setQuestionname("What is java?");
		question1.setAnswers(list1);
		
		//For question number 2
		Question question2=new Question();
	    question2.setQuestionname("What is servlet?");
	    question2.setAnswers(list2);
	    
	    session.persist(question1);
	    session.persist(question2);
	    
	    transaction.commit();
	    session.close();
	    System.out.println("Success");
	    
	}
}
