package com.Shapehierarchy;

public abstract class ThreeDimentionalShap extends Shape {

	ThreeDimentionalShap(float dimension1) {
		super(dimension1);
	}
	ThreeDimentionalShap(float length,float width,float height) {
		super(length,width,height);
	}
	abstract void getArea();
	abstract void getVolume();
	
}

//Class for sphare
class Sphare extends ThreeDimentionalShap{
	Sphare(float radius){
		super(radius);
	}
	void getArea() {
		float areaofsphare=(4*((float)Math.PI)*getDimention1()*getDimention1());
		System.out.println("Area of sphare : "+areaofsphare);
	}
	void getVolume() {
		float sphareVolume=(((float)4.0/(float)3.0)*((float)Math.PI)*getDimention1()*getDimention1()*getDimention1());
		System.out.println("Volume of sphare : "+sphareVolume);
	}
}

// Class for cube
class Cube extends ThreeDimentionalShap{
	Cube(float side){
		super(side);
	}
	void getArea() {
		float areaofcube=(6*getDimention1()*getDimention1());
		System.out.println("Area of cube : "+areaofcube);
	}
	void getVolume() {
		float cubeVolume=(getDimention1()*getDimention1()*getDimention1());
		System.out.println("Volume of cube : "+cubeVolume);
	}
}

//Class for Cuboid
class Cuboid extends ThreeDimentionalShap{
	float length;
	float width;
	float height;
	Cuboid(float length,float width,float height){
		super(length,width,height);
	}
	void getArea() {
		
		this.length=getDimention1();
		this.width=getDimention2();
		this.height=getDimention3();
		float areaofcuboid=(2*((length*width)+(width*height)+(length*height)));
		System.out.println("Area of cuboid : "+areaofcuboid);
	}
	void getVolume() {
		float cuboidVolume=(getDimention1()*getDimention2()*getDimention3());
		System.out.println("Volume of cuboid : "+cuboidVolume);
	}
}
