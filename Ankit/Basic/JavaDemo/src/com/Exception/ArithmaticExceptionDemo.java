package com.Exception;

public class ArithmaticExceptionDemo {
	
	public static void main(String args[]) {
		
		int a=9;
		int b=0;
		
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Got some technical proble....Come back soon"+e);
		}
	}

}
