package com.Shapehierarchy;

public abstract class TwoDimentionalShape extends Shape {

	TwoDimentionalShape(float side1){
		super(side1);
	}
    TwoDimentionalShape(float side1,float side2) {
		super(side1,side2);
	}
	abstract void getArea();
}
