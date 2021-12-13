package com.java8.lambda;

interface Sayable1{
	String Say(String name);
}
public class LambdaExpressionWithSingleParameter {

	public static void main(String args[]) {
		
		
		Sayable1 s=(name) ->{
			return name;
		};
		System.out.println("My name is "+s.Say("ankit"));
	}
}
