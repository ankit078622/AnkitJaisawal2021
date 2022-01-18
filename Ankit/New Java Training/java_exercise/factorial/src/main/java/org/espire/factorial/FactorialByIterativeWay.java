package org.espire.factorial;

import java.util.Scanner;

public class FactorialByIterativeWay {

	/*
	 * Method to find the factorial
	 */
	public static int findFactorial(int number) {
		//Declaring the variable
		int i,factorialOfNumber=1;
		
		if(number==0) {
			return 1;
		}
		else {
			//Iterating 
			for(i=1;i<=number;i++) {
				factorialOfNumber=factorialOfNumber*i;
			}
			return factorialOfNumber;
		}
		
	}
	
	//Main method 
	public static void main(String args[]) {
		
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//Taking input
		int inputNumber=sc.nextInt();
		System.out.println(findFactorial(inputNumber));
		
	}
}
