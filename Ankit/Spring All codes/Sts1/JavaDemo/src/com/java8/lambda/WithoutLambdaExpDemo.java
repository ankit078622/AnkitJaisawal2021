package com.java8.lambda;

interface Drawable{
	public void draw();
}

public class WithoutLambdaExpDemo {

	public static void main(String args[]) {
		int width=10;
		
		//without lambda, Durable implementation using anonymous class
		Drawable d=new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing "+width);
				
			}
		};
		d.draw();
	}
}
