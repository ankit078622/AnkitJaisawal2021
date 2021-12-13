/*
 Write a program that takes as input the size of the array and the elements in the array. 
The program then asks the user to enter a particular index and prints the element at that index. 
This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms 
to handle this exception. In the catch block, print the class name of the exception thrown.
 Sample Input and Output 1: Enter the number of elements in the array 3 
                            Enter the elements in the array 20 90 4 
                            Enter the index of the array element you want to access 2 The array element at index 2 = 4 
							The array element successfully accessed
*/
 package com.exceptionhandling;

import java.util.Scanner;

public class ArrarIndexOutOfBondDEmo {
	
	public static void main(String args[]) {
		int size;
				
		Scanner obj=new Scanner(System.in);
		
		//Here taking the size of array as input
		System.out.print("Enter size of the array : ");
		size=obj.nextInt();
		
		int array[]=new int[size];
		
		//For taking input in the array
		System.out.println("\nEnter the elements in the array : ");
		for(int i=0;i<size;i++) {
			array[i]=obj.nextInt();
		}
				
		try {
			int searchValueAtIndex;
			System.out.println("Enter the index of the array element you want to access : ");
			searchValueAtIndex=obj.nextInt();	
			System.out.println("The array element at index "+searchValueAtIndex+" is array["+searchValueAtIndex+"]: "+array[searchValueAtIndex]);
		    System.out.println("The array element successfully accessed");
		    
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered index is not correct "+e);
		}
	}

}
