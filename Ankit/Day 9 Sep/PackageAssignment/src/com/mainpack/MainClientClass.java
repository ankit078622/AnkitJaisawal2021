package com.mainpack;

import com.Addition.AdditionService;
import com.Division.DivisionService;
import com.EvenOdd.OddEvenService;
import com.Multiplication.MultiplyService;
import com.substract.SubstractionService;

public class MainClientClass {
	public static void main(String args[]) {
		
		
		//Calling AdditionService class member by creating object of that class
		AdditionService additionService=new AdditionService();
		int resulSum=additionService.calculateAddition(5, 6);
		System.out.println("Sum = "+resulSum);
		
		//Calling SubstractionService class member by creating object of that class
		SubstractionService substractionService=new SubstractionService();
		int resultSub=substractionService.calculateSubstraction(5, 6);
		System.out.println("Substraction = "+resultSub);
		
		//Calling MultiplyService class member by creating object of that class
		MultiplyService multiplyService=new MultiplyService();
		int resultMultiply=multiplyService.calculateMultiplication(5, 6);
		System.out.println("Multiplication = "+resultMultiply);
		
		//Calling DivisionService class member by creating object of that class
		DivisionService divisionService=new DivisionService();
		float getResult=divisionService.calculateDivision((float)6,(float)4);
		System.out.println("Division = "+getResult);
		
		//Calling OddEven class member by creating object of that class by return type
		OddEvenService oddEven=new OddEvenService();
		int num=6;
		int resultOE=oddEven.getEvenOdd(num);
		if(resultOE==1) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+"is odd");
		}
		
		//Calling OddEven class member by creating object of that class direct print
		OddEvenService oddEven1=new OddEvenService();
		oddEven1.getEvenOddNum(6);
	}

}
