/*Write */
package com.AssInheritence;

class Shape{
	void draw(){
		System.out.println("We are in Shape class and in draw() method");
	}
	void erase() {
		System.out.println("We are in Shape class and in erase() method");
	}
}
class Circle extends Shape{
    void draw(){
    	System.out.println("We are in Circle class and in draw() method");
	}
	void erase() {
		System.out.println("We are in Circle class and in erase() method");
	}
}
class Triangle extends Shape{
	void draw(){
		System.out.println("We are in Triangle class and in draw() method");
	}
	void erase() {
		System.out.println("We are in Triangle class and in erase() method");
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("We are in Square class and in draw() method");
	}
	void erase() {
		System.out.println("We are in Square class and in erase() method");
	}
}
public class InheritenceShape {
	
	public static void main(String args[]) {
		// Creating object of square class
		Shape square=new Square();
		square.draw();
		square.erase();
		
		//Creating object of Triangle class
		Shape triangle=new Triangle();// Run time polymorphism
		triangle.draw();
		triangle.erase();
		
		//Creating object Circle class
		Shape circle=new Circle();
		circle.draw();
		circle.erase();
		
		//Creating object of shape class
		Shape shape=new Shape();
		shape.draw();
		shape.erase();
		
		
		
	}

}
