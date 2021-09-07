package com.javaConstructor;

public class ConstructorAssignment {
	//Zero Argument Constructor
	ConstructorAssignment() {
		System.out.println("Welcome to student portal ");
	}
	//Constructor with parameter
	ConstructorAssignment(int rollNumber,String name){
	    System.out.println("Student roll number : "+rollNumber+"\nStudent Name : "+name);	
	}
	//overloading
	ConstructorAssignment(int hindi,int english,int math){
		System.out.println("Total marks : "+(hindi+english+math));
		
	}
	public static void main(String args[]) {
		ConstructorAssignment constructorAssignment=new ConstructorAssignment();
		ConstructorAssignment constructorAssignment2=new ConstructorAssignment(101,"Rajesh");
		ConstructorAssignment constructorAssignment3=new ConstructorAssignment(70,75,80);
	}

}
