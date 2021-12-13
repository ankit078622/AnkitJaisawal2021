package com.ConsOverloading;

import com.Overloading.OverloadingWithDifferentParameter;

public class ConsOverloadingByDiffParameter {
	
	//For Employee
	ConsOverloadingByDiffParameter(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}

	//For Student
	ConsOverloadingByDiffParameter(String stuname,int rollnum,int percent, String grade) {
		System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nPercentage : "+percent+"%\nGrade : "+grade);
	}
	
	//Main method
	public static void main(String args[]) {
		ConsOverloadingByDiffParameter consOverloadingByDiffParameter=new ConsOverloadingByDiffParameter("Arun", 101, 3);
		ConsOverloadingByDiffParameter consOverloadingByDiffParameter1=new ConsOverloadingByDiffParameter("Kishan", 1742, 60, "B");
	}
}
