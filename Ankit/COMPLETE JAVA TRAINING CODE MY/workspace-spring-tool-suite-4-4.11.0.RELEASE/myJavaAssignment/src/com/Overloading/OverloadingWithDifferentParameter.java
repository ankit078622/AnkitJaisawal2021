package com.Overloading;

public class OverloadingWithDifferentParameter {
	//for employee
	void getScore(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//For student 
	void getScore(String stuname,int rollnum,int percent, String grade) {
		System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nPercentage : "+percent+"%\nGrade : "+grade);
		
	}

	public static void main(String args[]) {
		OverloadingWithDifferentParameter overloadingWithDifferentParameter=new OverloadingWithDifferentParameter();
		overloadingWithDifferentParameter.getScore("Arvind", 101, 4);
		overloadingWithDifferentParameter.getScore("Kishan", 1742, 80, "A");
		
	}
}
