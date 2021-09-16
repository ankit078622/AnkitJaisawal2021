package com.finaldemo;

public class FinalVariableDemo {

	final int MAX_VALUE=99;
	void myMethod() {
		//MAX_VALUE=99;
		
	}
	
	public static void main(String args[]) {
		FinalVariableDemo obj=new FinalVariableDemo();
		obj.myMethod();
	}
}
