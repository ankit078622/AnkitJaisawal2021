package com.classobject;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[]) {
		Scanner scannerobj=new Scanner(System.in);
		System.out.println(" Enter an number ");
		String number = scannerobj.nextLine();

		int dummyvariable = Integer.parseInt(number); // primitive types
        
        float dummy=Float.parseFloat(number);

        System.out.println(" Number is " + dummyvariable);
	}
}
