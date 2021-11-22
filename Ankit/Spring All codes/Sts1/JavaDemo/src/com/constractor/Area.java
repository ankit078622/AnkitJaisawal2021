package com.constractor;

public class Area {
	
	Area(){
		int length=9;
		int breadth=8;
		
		int areaofreactangle=length*breadth;
		
		System.out.println("Area : "+areaofreactangle);
	}
	
	Area(int side){
		int areaofsquare=side*side;
		System.out.println("Area of square "+areaofsquare);
	}
	
	Area(int length,int breadth,int height){;
		int areaofvolume=length+breadth+height;
		System.out.println("Area of volume "+areaofvolume);
		
	}
	
	public static void main(String args[]) {
		Area area=new Area();
		Area area2=new Area(4);
		Area area3=new Area(5,6,9);
	}
	
}
