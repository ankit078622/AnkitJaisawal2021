package com.Exception;

public class ThrowsDemo {
	//Method level for throws
	static void validate(int age)throws ArithmeticException {
		if(age<18) {
			
			throw new ArithmeticException("Not valid for vote");
		}
	}
	
	public static void main(String args[]) {
		try {
			validate(12);
		}
		catch(Exception e) {
			System.out.println(" handled here");
		}
		
	}
}
