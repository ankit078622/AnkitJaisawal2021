package com.java8.lambda;
interface Circle{
	void draw();
}
public class WithoutLambdaExp {
	public static void main(String args[]) {
		int radius=5;
		Circle circle=new Circle() {
			
			@Override
			public void draw() {
				System.out.println("Drawing "+radius);
			}
		};
		circle.draw();
	}
}
