package com.classobject;

public class StaticMethodDemo {
	//static block
	static {
		System.out.println("From staic block 1");
	}
	static {
		System.out.println("From static block 2");
	}
	
	//static variable
	static int a=6;
	
	//Static method
	static void show(String name) {
		System.out.println("name is "+name);
	}
	
	public static void main(String args[]) {
		StaticMethodDemo.show("Ankit");// calling from class name 
		show("Anbkit");// directly call because main is static method
		System.out.println(StaticMethodDemo.a);
	}

}

