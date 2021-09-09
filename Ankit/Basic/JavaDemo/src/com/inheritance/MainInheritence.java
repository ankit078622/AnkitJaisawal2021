package com.inheritance;

class Calculation {
	
	int z;
	
	public void addition(int num1,int num2) {
		z=num1+num2;
		System.out.println("The sum of the given number "+z);
	}
	
	public void substraction(int num1,int num2) {
		z=num1-num2;
		System.out.println("The substraction of the given number "+z);			
	}

}
class MyCalculation extends Calculation{
	 public void multiplication(int num1, int num2) {
            z = num1 * num2;
	        System.out.println(" the mul fo the given number " + z);
	    }
}
public class MainInheritence{
	public static void main(String arsg[]) {
		 int a = 10, b = 20;

        // now we are creating the obj of derived class 

        MyCalculation mycalculation = new MyCalculation(); 

        mycalculation.addition(a, b); // from parent class 

        mycalculation.substraction(a, b); /// from parent clas 

        mycalculation.multiplication(a, b);// this from based
	}
}
