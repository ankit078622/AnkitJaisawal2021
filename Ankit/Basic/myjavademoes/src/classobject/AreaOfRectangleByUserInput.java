/*(6).Write a program to print the area of a rectangle by creating a class named 'Area' having two
 two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and 
 the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle
  are entered through keyboard.
 */
package classobject;
import java.io.DataInputStream;
import java.io.IOException;;
class Area {
	int length,breadth;
	//For set the dimension
	void setDimension(int len,int brea)	{
		length=len;
		breadth=brea;
	}
	
	//For calculating the area of rectangle
	int getArea() {
		return length*breadth;
	} 
	
}
public class AreaOfRectangleByUserInput {
   public static void main(String args[])throws IOException
   {
	   DataInputStream input=new DataInputStream(System.in);
	   int length,breadth;
	   System.out.print("Please Enter length of rectangle ");
	   length=Integer.parseInt(input.readLine());
	   System.out.print("Please Enter breadth of rectangle ");
	   breadth=Integer.parseInt(input.readLine());
	   //Creating object
	   Area area=new Area();
	   area.setDimension(length, breadth);
	   int temp1=area.getArea();
	   System.out.println("Area of rectangle is "+temp1);
	   
	   
   }
}
