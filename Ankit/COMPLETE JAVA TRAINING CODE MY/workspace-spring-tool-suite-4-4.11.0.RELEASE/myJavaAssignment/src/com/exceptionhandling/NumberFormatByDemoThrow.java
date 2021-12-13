package com.exceptionhandling;

import java.util.Scanner;

public class NumberFormatByDemoThrow {
	
	static void checkInteger(String num) {
		
		int i=Integer.parseInt(num);// here checking weather given input is integer of not
		System.out.println("The Square of number is : "+i*i);
						
	}
	public static void main(String args[]) {
		
		try {
			String num;
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter an integer : ");
			num=obj.next();
			checkInteger(num);
					
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer");
		}
	}

}
