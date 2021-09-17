package com.java8Streams;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int rollNum;
	String name;
	String course;
    float fee;
	
	public Student() {
		
	}
	//Constructor
	public Student(int rollNum, String name, String course, float fee) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	
	
	
}
public class FilterCollectionWithoutUsingStream {

	public static void main(String args[]) {
	
		List<Student> studentlist=new ArrayList<Student>();
		
		studentlist.add(new Student(101, "Ram", "Java", 15000));
		studentlist.add(new Student(102, "Rahul" ,".Net", 9000));
		
		List<Float>  studentCourseList=new ArrayList<Float>();
		for(Student student: studentlist) {
			
			//filtering data of list
			if(student.fee>9000) {
				
				studentCourseList.add(student.fee);
			}
		}
		System.out.println(studentCourseList);
	}
}
