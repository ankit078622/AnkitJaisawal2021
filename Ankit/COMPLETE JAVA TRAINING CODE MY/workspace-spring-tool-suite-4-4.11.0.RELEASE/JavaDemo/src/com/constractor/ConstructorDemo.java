package com.constractor;

public class ConstructorDemo {
	static {
		System.out.println("hi");
	}
	
	//constructor
	ConstructorDemo() {
		System.out.println(" from constructor show");
	}
	
	//Parameterized constructor
	ConstructorDemo(int number1,int number2) {
		int dummy=number1+number2;
		System.out.println("sum of two number is "+dummy);
	}
	
	//method
	public void show() {
		System.out.println("from method show");
	}
	
	static void show1() {
		System.out.println(" from method show1");
	}
	
	public static void main(String args[]) {
		ConstructorDemo constructorDemo=new ConstructorDemo();
		constructorDemo.show();
		show1();
		
		//Parameterized
		ConstructorDemo constructorDemo2=new ConstructorDemo(5,7);
	}

}
