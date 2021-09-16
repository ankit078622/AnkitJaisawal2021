package com.java8.lambda;

interface OddEven{
	int checkOddEven(int num);
}
public class LambdaForOdd {

	public static void main(String args[]) {
		//int result;
		OddEven oddevennum=(num) ->{
			int result=(num%2);
			return result;
		};
		
		int flag;
		flag=oddevennum.checkOddEven(5);
		System.out.println(flag==0?"Even Number":"Odd Number");
		
	}
}
