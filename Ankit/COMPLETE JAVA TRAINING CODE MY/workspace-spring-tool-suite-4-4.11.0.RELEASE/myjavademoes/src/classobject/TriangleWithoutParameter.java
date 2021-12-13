package classobject;

class  AreaPerimeterWithoutParameter{
	//Area of triangle
	float area() {
		float side1=(float) 3;
		float side2=(float) 4;
		float side3=(float) 5;
		float s=(float) (side1+side2+side3)/2;
		float areaoftriangle=(float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));		
		return areaoftriangle;		
	}
	
	//Perimeter of triangle
	int perimeter()	{
		int side1=3;
		int side2=4;
		int side3=5;
   		return (side1+side2+side3);// Perimeter=side1+side2+side3
	}
	
}

public class TriangleWithoutParameter {
	public static void main(String args[]){
		//creating object for area which is in float
		AreaPerimeterWithoutParameter areaPerimeterWithoutParameter1=new AreaPerimeterWithoutParameter();
		float temp1=areaPerimeterWithoutParameter1.area();
		System.out.println("Area of triangle is "+temp1);
		
		//creating object for perimeter
		AreaPerimeterWithoutParameter areaPerimeterWithoutParameter2=new AreaPerimeterWithoutParameter();
		int temp2=areaPerimeterWithoutParameter2.perimeter();
		System.out.println("Perimeter of triangle is "+temp2);
	
	}
}

