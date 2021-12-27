package org.espire.factorial;

import java.util.Scanner;

public class FactorialByRecursiveWay {
	
	/*
	 * Program to find the factorial
	 */
	public static int findFactorial(int number) {
		
		if(number<1) {
			return 1;
		}
		else {
			//recursive calling
			return number*findFactorial(number-1);
		}
		
	}
	
	//Main method
	public static void main(String args[]) {
		
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//Taking input
		int input=sc.nextInt();
		
		//calling the function
	    findFactorial(input);		
	}
}
