package classobject;

class AreaPerimeterWithParameter{
	//Area of triangle
	float area(float side1,float side2,float side3) {
		float s=(float) (side1+side2+side3)/2;
		float areaoftriangle=(float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));		
		return areaoftriangle;		
	}
	
	//Perimeter of triangle
	int perimeter(int side1,int side2,int side3)	{
		return (side1+side2+side3);// Perimeter=side1+side2+side3
	}

}
public class TriangleWithParameter {
	public static void main(String args[])	{
		//Creating Object for area 
		AreaPerimeterWithParameter areaPerimeterWithParameter1=new AreaPerimeterWithParameter();
		float temp1=areaPerimeterWithParameter1.area(3, 4, 5);
		System.out.println("Area of triangle ="+temp1);
		
		//Creating Object for perimeter
		AreaPerimeterWithParameter areaPerimeterWithParameter2=new AreaPerimeterWithParameter();
		int temp2=areaPerimeterWithParameter2.perimeter(3, 4, 5);
		System.out.println("Perimeter of triangle ="+temp2);
		
		
	}

}
