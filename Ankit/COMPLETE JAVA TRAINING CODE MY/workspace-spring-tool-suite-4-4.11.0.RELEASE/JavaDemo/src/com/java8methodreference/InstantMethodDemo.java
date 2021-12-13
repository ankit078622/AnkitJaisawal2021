package com.java8methodreference;

interface Sayable6{
	void say();
}
public class InstantMethodDemo {

	//non static method
	public void saySomeThing() {
		System.out.println(" hello ! ");
	}
	public static void main(String args[]) {
		//1
		//Referring non-static method using reference
		InstantMethodDemo instantMethodDemo=new InstantMethodDemo();
		
		//2
		Sayable6 sayable6=instantMethodDemo::saySomeThing;
		
		sayable6.say();//Way to calling the interface method
		
		//by using in lambda exp
		//3
		Sayable6 sa=new InstantMethodDemo()::saySomeThing;
		//sa.say();
				
	}
}