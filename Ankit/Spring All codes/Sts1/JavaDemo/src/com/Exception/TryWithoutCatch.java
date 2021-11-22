package com.Exception;

public class TryWithoutCatch {
	
	public static void main(String args[]) {
	int a=9;
	int b=0;
	int array[]= {1,5,3,7};
	
	try {
		
		System.out.println(array[7]);
	}

	finally {
		System.out.println("Message from finally block");
	}
  }
}
