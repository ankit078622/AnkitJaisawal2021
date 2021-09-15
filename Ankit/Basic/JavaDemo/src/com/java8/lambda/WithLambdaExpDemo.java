package com.java8.lambda;

public class WithLambdaExpDemo {
	
	public static void main(String args[]) {
		
		int width=10;
		
		//without lambda, Drawable implementation using anonymous class
		Drawable d=()->{
			
			System.out.println("Drawing "+width);
			
		};
		d.draw();
	}

}
