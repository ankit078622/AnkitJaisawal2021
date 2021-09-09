package com.classobject;

class Student{
	String getName(String name) {
		return name;
	}
	int getRollNumber(int rollNumber) {
		return rollNumber;
	}
}
public class StudentRecord {
	public static void main(String args[]) {
		//creating object for name  for string variable
		Student student=new Student();
		String name=student.getName("John");
		System.out.println("Student name : "+name);
		
		//creating object for roll number int variable
	    Student student1=new Student();
	    int rollnum=student1.getRollNumber(2);
	    System.out.println("Student roll number : "+rollnum);
	    
	    
	}
}

