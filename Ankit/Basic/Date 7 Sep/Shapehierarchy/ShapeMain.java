package com.Shapehierarchy;

public class ShapeMain {

	public static void main(String args[]) {
		//Creating object for circle
		TwoDimentionalShape twoDimentionalShape=new Circle((float)8);
		twoDimentionalShape.getArea();
		
		//Creating object for Square
		TwoDimentionalShape twoDimentionalShape1=new Square((float)8);
		twoDimentionalShape1.getArea();
		
		//Creating object for Square
		TwoDimentionalShape twoDimentionalShape2=new Triangle((float)9,(float)7);
		twoDimentionalShape2.getArea();
		
		//Creating object for SphareArea
		ThreeDimentionalShap threeDimentionalShap3=new Sphare((float)8);
		threeDimentionalShap3.getArea();
		
		//Creating object for Spharevolume
		ThreeDimentionalShap threeDimentionalShapV=new Sphare((float)8);
		threeDimentionalShapV.getVolume();
		
		//Creating object for Cube Area
		ThreeDimentionalShap threeDimentionalShapC=new Cube((float)3);
		threeDimentionalShapC.getArea();
		
		//Creating object for  Cube volume
		ThreeDimentionalShap threeDimentionalShapCV=new Cube((float)3);
		threeDimentionalShapCV.getVolume();
		
		//Creating object for Cube Area
		ThreeDimentionalShap Cuboid1=new Cuboid((float)3,(float)5,(float)2);
		Cuboid1.getArea();
		
		//Creating object for  Cube volume
		ThreeDimentionalShap Cuboid2=new Cuboid((float)3,(float)5,(float)2);
		Cuboid2.getVolume();
   }
	
}
