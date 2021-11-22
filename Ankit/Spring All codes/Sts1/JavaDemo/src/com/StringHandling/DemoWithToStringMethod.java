package com.StringHandling;

class Student1{
	int rollNumber;
	String name;
	
    public Student1(int rollnumber,String name) {
		
		this.rollNumber=rollnumber;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student1 [rollNumber=" + rollNumber + ", name=" + name +  "]";
	}
	
}
public class DemoWithToStringMethod {
	
    public static void main(String args[]) {
		
		Student1 student1=new Student1(1,"Ankit");
		//System.out.println(student1);
		
	}

}
