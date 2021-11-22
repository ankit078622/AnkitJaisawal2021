package com.CallPackage;

import com.AdditionService.Addition;

public class MainCallPackage {
	public static void main(String args[]) {
		Addition addition=new Addition();
		int sumResult=addition.getAddition(5, 6);
		System.out.println(sumResult);
	}

}
