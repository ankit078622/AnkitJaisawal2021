package com.java8.lambda;
interface CheckOddEven{
	int isOdd(int num);
}
public class OddEvenByImplementingMethod {
	public static void main(String args[]) {
		
		CheckOddEven checkoddeven=(num)->{
			
			if(num%2==0) {
				return 0;
			}
			else {
			   return 1;
			}
		};
		int result,num=6;
		result=checkoddeven.isOdd(num);
		if(result==0) {
			System.out.println("The given number is even = "+num);
		}
		else {
			System.out.println("The given number is odd = "+num);
		}
		
	}

}
