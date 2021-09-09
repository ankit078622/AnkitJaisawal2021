package com.classobject;

import java.util.Scanner;

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
	public static void main(String args[])	{
		Scanner input=new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Enter first number ");
		num1=input.nextInt();// Input first number
		System.out.print("Enter first number ");
		num2=input.nextInt();// Input second number
		System.out.print("Enter first number ");
		num3=input.nextInt();// Input third number
		
		//Creating object of the class for passing the parameter
		CalculateAverage calculateAvg=new CalculateAverage();	
		calculateAvg.calculate(num1, num2, num3);
		int temp=calculateAvg.printAverage();
		System.out.println(temp);		
	}
}