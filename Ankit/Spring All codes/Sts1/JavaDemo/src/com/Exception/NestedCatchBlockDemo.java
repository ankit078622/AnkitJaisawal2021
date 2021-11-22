package com.Exception;

public class NestedCatchBlockDemo {
	public static void main(String args[]) {
		
		int a=9;
		int b=0;
		
		int array[]= {5,8,9,2};
		
		try {//Outer try
			
			try {//ineer try
				
				int c=a/b;				
			}
			catch(ArithmeticException e) {
				System.out.println("Got some technical problem.. come back soon  "+e);
			}
			
			try {//inner
				
				System.out.println(array[6]);
			}
			catch(ArrayIndexOutOfBoundsException e) {//inner catch block
				
				System.out.println("Got some technical problem... come back soon"+e);
				
			}
			
		}
		catch(ArithmeticException e) {//outer catch block
			
			System.out.println("Got some technical problem..come back soon"+e);
		}
		
	}

}
