package com.Shapehierarchy;

public class Circle extends TwoDimentionalShape {
    float areaofcircle;
	Circle(float radius){
		super(radius);
	}
	
	//For circle area
	
	void getArea()	{
		areaofcircle=getDimention1()*getDimention1()*(float)Math.PI;
		System.out.println("Area of circle : "+areaofcircle);
	}
}
