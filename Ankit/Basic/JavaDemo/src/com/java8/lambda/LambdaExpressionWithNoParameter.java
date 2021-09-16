package com.java8.lambda;

interface Sayable{
	 String Say();
}
public class LambdaExpressionWithNoParameter {

	public static void main(String args[]) {
		Sayable s=() ->{
			
			return "Hi";
		};
		System.out.println(s.Say());
	}
}
