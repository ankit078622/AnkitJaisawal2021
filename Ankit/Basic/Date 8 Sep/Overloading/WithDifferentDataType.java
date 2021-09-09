package com.Overloading;
// Overloading with different data types
//Write a Java Program to demonstrate the Method Overloading with difference in datatypes of parameters.
public class WithDifferentDataType {
	
	void calculateSum(int num1,int num2) {
		System.out.println("Sum of two integer number : "+(num1+num2));
	}
	
    void calculateSum(float num1,float num2) {
    	System.out.println("Sum of two float number : "+(num1+num2));
	}
    
    void calculateMultiply(int num1,int num2) {
    	System.out.println("Multiplication of two integer number : "+(num1*num2));
	}
	
    void calculateMultiply(float num1,float num2) {
    	System.out.println("Multiplication of two float number : "+(num1*num2));
	}

    public static void main(String args[]) {
    	//Creating object for integer number
    	WithDifferentDataType withDifferentDataType=new WithDifferentDataType();
    	withDifferentDataType.calculateSum(6, 9);
    	withDifferentDataType.calculateMultiply(6, 9);
    	
    	
    	//Creating object for float number
    	WithDifferentDataType withDifferentDataType1=new WithDifferentDataType();
    	withDifferentDataType1.calculateSum((float)7.6,(float)8.9);
      	withDifferentDataType1.calculateMultiply((float)7.6,(float)8.9);
    }
    
    
}
