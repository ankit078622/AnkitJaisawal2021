package com.inheritance;
class MethodOverloading {
	void Area()	{
		int length=9;
		int breadth=8;
		
		int areaofreactangle=length*breadth;
		
		System.out.println("Area : "+areaofreactangle);
	
	}
	void Area(int side){
		int areaofsquare=side*side;
		System.out.println("Area of square "+areaofsquare);
	}
	
	void Area(int length,int breadth,int height){;
		int areaofvolume=length+breadth+height;
		System.out.println("Area of volume "+areaofvolume);
		
	}
}
public class MethodOverloadingDemo {
	public static void main(String args[]) {
		MethodOverloading methodOverloading=new MethodOverloading();
		methodOverloading.Area();
		methodOverloading.Area(4);
		methodOverloading.Area(5,6,8);
	}
}
