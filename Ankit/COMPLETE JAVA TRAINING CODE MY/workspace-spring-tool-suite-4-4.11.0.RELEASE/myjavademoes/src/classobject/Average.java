/*(8). Print the average of three numbers entered by user by creating a class named 'Average' having a 
 method to calculate and print the average . */
package classobject;

import java.io.DataInputStream;
import java.io.IOException;

class CalculateAverage{
	int avg;
	void calculate(int num1,int num2,int num3) {
		avg=(num1+num2+num3)/3;		
	}
	int printAverage() {
		return avg;
	}
}
public class Average {
	public static void main(String args[])throws IOException	{
		DataInputStream input=new DataInputStream(System.in);
		int num1,num2,num3;
		System.out.print("Enter first number ");
		num1=Integer.parseInt(input.readLine());// Input first number
		System.out.print("Enter first number ");
		num2=Integer.parseInt(input.readLine());// Input second number
		System.out.print("Enter first number ");
		num3=Integer.parseInt(input.readLine());// Input third number
		
		//Creating object of the class for passing the parameter
		CalculateAverage calculateAvg=new CalculateAverage();	
		calculateAvg.calculate(num1, num2, num3);
		int temp=calculateAvg.printAverage();
		System.out.println(temp);		
	}
}
