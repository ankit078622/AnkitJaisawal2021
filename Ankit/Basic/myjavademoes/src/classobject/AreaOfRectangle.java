package classobject;

class Rectangle{
	//Area of rectangle
	int area(int length,int breadth) {
		return length*breadth;
	}
	
}
public class AreaOfRectangle {
	public static void main(String args[]) {
		// for side(4,5)
		Rectangle rectangle1=new Rectangle();
		int temp1=rectangle1.area(4,5);
		System.out.println("Area of rectangle for side 4 and 5 is "+temp1);
		
		//For side(5,8)
		Rectangle rectangle2=new Rectangle();
		int temp2=rectangle2.area(5,8);
		System.out.println("Area of rectangle for side 5 and 8 is "+temp2);
		
	}

}
