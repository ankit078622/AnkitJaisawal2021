package com.ConsOverloading;
/*Write a Java Program to demonstrate the Method Overloading with difference in datatypes of parameters.*/
public class ConsOverloadingDiffDataType {
	
    ConsOverloadingDiffDataType(int num1,int num2) {
		System.out.println("Sum of two integer number : "+(num1+num2));
	}
	
    ConsOverloadingDiffDataType(float num1,float num2) {
    	System.out.println("Sum of two float number : "+(num1+num2));
	}
    
    public static void main(String args[]) {
    	ConsOverloadingDiffDataType consOverloadingDiffDataType=new ConsOverloadingDiffDataType(8, 3);
    	ConsOverloadingDiffDataType consOverloadingDiffDataType2=new ConsOverloadingDiffDataType((float)5.5,(float)8.9);
    }

}
