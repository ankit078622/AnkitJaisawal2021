package com.inheritance;

class Animal{
	void move(String name) {
		System.out.println("cat move --> "+name);
	}
}
class Cat extends Animal{
	void move(String name) {
		System.out.println("cat move --> "+name);
		super.move(" from animal "); // demostration super class
	}
}
public class OverridingDemo {
	public static void main(String args[]) {
		Cat cat=new Cat();
		cat.move("cat");
		
		Animal animal=new Cat();// correct it example run time polymorphisum  dyanmic dispatchor or daynamic  binding
		animal.move("dog");
	}
}
