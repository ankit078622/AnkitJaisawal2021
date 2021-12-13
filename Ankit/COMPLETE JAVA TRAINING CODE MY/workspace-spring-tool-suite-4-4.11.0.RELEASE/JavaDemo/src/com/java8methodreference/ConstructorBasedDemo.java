package com.java8methodreference;

interface Sayable7{
	void say();
}
public class ConstructorBasedDemo {

	public static void main(String args[]) {
		Sayable7 h=ConstructorBasedDemo::new;
		h.say();
	}
	
	//Construcytor

	ConstructorBasedDemo() {
	  System.out.println("From Constructor");
	}
}
