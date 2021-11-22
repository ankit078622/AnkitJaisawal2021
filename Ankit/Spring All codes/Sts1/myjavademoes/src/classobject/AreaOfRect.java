package classobject;

import java.io.DataInputStream;
import java.io.IOException;

class RectangleArea{
	int returnArea(int length,int breadth) {
		return length*breadth;
	} 
}
public class AreaOfRect {
	public static void main(String args[])throws IOException	{
		
		DataInputStream input=new DataInputStream(System.in);
		int length,breadth;
		System.out.print("Please Enter length of rectangle ");
	    length=Integer.parseInt(input.readLine());
	    System.out.print("Please Enter breadth of rectangle ");
	    breadth=Integer.parseInt(input.readLine());
	    
	    //Creating object of class
	    RectangleArea rectangleArea=new RectangleArea();
	    int temp1=rectangleArea.returnArea(length, breadth);
	    System.out.println("Area of rectangle "+temp1);
		
	}

}
