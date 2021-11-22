package com.StringHandling;

class Student{
	
	int rollNumber;
	String name;

	public Student(int rollnumber,String name) {
		
		this.rollNumber=rollnumber;
		this.name=name;
	}
}
public class DemoWithoutToStringMethod {

	public static void main(String args[]) {
		
		Student student=new Student(1,"Ankit");
		System.out.println(student);
		
	}
}
