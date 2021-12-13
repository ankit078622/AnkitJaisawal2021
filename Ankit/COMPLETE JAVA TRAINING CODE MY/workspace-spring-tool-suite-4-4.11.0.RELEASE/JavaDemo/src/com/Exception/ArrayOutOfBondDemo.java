package com.Exception;

public class ArrayOutOfBondDemo {
	
        public static void main(String args[]) {
		
		int a[]= {1,2,3,4};
		
		try {
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Got some technical proble....Come back soon "+e);
		}
	}
}
