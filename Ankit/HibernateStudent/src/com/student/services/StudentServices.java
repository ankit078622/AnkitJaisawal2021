package com.student.services;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.util.HibernateUtil;
import com.hibernateStudent.Student;

public class StudentServices {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	
	/*------------------------Post request--------------------------------------*/
	/* Method to CREATE an Student table in the database business logic */
	public Integer addStudent(String name, String course, float fee) {
		Transaction transaction=null;
		Integer studentDetails=null;
		try {		
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			Student student=new Student(name, course, fee);
			studentDetails=(Integer) sessionObj.save(student);
			transaction.commit();
		}
		catch (HibernateException e) {
		   if(transaction!=null) {
			   transaction.rollback();
		   }
		   e.printStackTrace();
		}
		finally {
			sessionObj.close();
		}
		
		return studentDetails;
	}
	
	/*------------------------Get Request-------------------------------------------------*/
	/*Method to get list of students from database*/
	public void ListOfAllStudents() {
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			
			//Logic
			List students=sessionObj.createQuery("From Student").list();
			Iterator iterator=students.iterator();
			while(iterator.hasNext()) {
				Student student1=(Student) iterator.next();
				System.out.println("Student Roll number "+student1.getRollNo());
				System.out.println("Student Name "+student1.getName());
				System.out.println("Student Course "+student1.getCourse());
				System.out.println("Student Course  Fee"+student1.getFee()+"\n");
			}
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
	
	/*----------------------------------------UPDATE-----------------------------------------------------*/
	/*------------------------------PUT request id------------------------------------------------------*/
	/*Method to update an employee in the database business logic*/
	public void updateStudentDetails(Integer StudentId,String course) {
		
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
			//update logic
			Student student=(Student) sessionObj.get(Student.class, StudentId);
			student.setCourse(course);
			sessionObj.update(student);// hibernate will form update query automatically
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
	/*--------------------------------Put request id-----------------------------------------*/
	/*Method for delete employee record*/
	public void deleteStudentById(Integer StudentId,String course) {
		Transaction transaction=null;
		try {
			sessionObj=HibernateUtil.buildSessionFactory().openSession();
			transaction=sessionObj.beginTransaction();
		    Student student=(Student) sessionObj.get(Student.class,StudentId);
			student.setCourse(course);
			sessionObj.delete(student);// hibernate will form delete query automatically
			System.out.println("deleted sucessfully..."+student.getRollNo());;
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
