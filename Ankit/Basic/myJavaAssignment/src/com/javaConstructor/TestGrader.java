package com.javaConstructor;

public class TestGrader {
	public static void main(String args[]) {
		
		Grader grader1=new Grader("Ram",80,70,50,90);
		grader1.letterGrade();
		Grader grader2=new Grader("Alok",80,90,90,90);
		grader2.letterGrade();
		Grader grader3=new Grader("Amrit",65,70,88,47);
		grader3.letterGrade();
		
		}
	
}
