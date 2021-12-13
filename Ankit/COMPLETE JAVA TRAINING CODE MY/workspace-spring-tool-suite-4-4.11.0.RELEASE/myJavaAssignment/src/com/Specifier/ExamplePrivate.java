package com.Specifier;

class AreaCircle{
	private double radius=5;
	//I have created getter and setter method for access the private variable
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	void getArea() {
		System.out.println("Area of circle : "+(Math.PI*radius*radius));
	}
}
public class ExamplePrivate {
	public static void main(String args[]) {
		AreaCircle areaCircle=new AreaCircle();
		//System.out.println("Radius : "+areaCircle.radius);// here we can can not access private variable
		System.out.println("Radius : "+areaCircle.getRadius());
		areaCircle.getArea();
	}


}
