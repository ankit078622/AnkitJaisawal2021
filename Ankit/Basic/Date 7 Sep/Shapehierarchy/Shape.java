package com.Shapehierarchy;

public abstract class Shape {
	float dimention1;
	float dimention2;
	float dimention3;
	
	//Getter and setter
	public float getDimention1() {
		return dimention1;
	}

	public void setDimention1(float dimention1) {
		this.dimention1 = dimention1;
	}

	public float getDimention2() {
		return dimention2;
	}

	public void setDimention2(float dimention2) {
		this.dimention2 = dimention2;
	}

	public float getDimention3() {
		return dimention3;
	}

	public void setDimention3(float dimention3) {
		this.dimention3 = dimention3;
	}

	
	// Single parameter constructor
	Shape(float side1){
		this.dimention1=side1;
	}
	
	//Double parameter constructor
	Shape(float side1,float side2) {
		this.dimention1=side1;
		this.dimention2=side2;
	}
	//Three parameter constructor
	Shape(float side1,float side2,float side3) {
		this.dimention1=side1;
		this.dimention2=side2;
		this.dimention3=side3;
	}
	
	//abstract void getArea();
	//abstract void getVolume();//doubt
}
