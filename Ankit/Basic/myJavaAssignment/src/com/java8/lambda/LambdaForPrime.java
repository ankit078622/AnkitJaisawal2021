package com.java8.lambda;
//PerformOperation isPrime(): The lambda expression must return  true if a number is prime or  if it is composite.
interface Prime{
	int isPrime(int num);
}
public class LambdaForPrime {
	
	public static void main(String args[]) {
		Prime prime=(num)->{
			int check=0,result;
			for(int i=2;i<num/2;i++) {
				if(num%2!=0) {
					check=1;
					break;
				}
				
			}
			return check;
		};
		int result=prime.isPrime(5);
		System.out.println("The given number is : "+(result==1?"Not Prime":"Prime"));
	}

}
