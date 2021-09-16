package com.java8methodreference;

interface Animal{
	void eat();
}
interface Sayable5{
	void say();
}
public class MethodReferenceDemo {

	public static void saySomeThing() {
		System.out.println(" Hello ! ");
	}
	
	public static void main(String args[]) {
		Animal sayblee=MethodReferenceDemo::saySomeThing;
		
		sayblee.eat();
		
		Sayable5 sayable5=MethodReferenceDemo::saySomeThing;
		
		sayable5.say();
	}
}
