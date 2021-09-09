package com.Shapehierarchy;

public class Square extends TwoDimentionalShape{
	float areaofsquare;
	Square(float side){
		super(side);
	}
	// for calculating the area	
	void getArea() {
		areaofsquare=getDimention1()*getDimention1();
		System.out.println("Area of Square : "+areaofsquare);
	}

}
