package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithLambdaLoop {

	public static void main(String args[]) {
		List<String> list=new ArrayList<String>();
		
		list.add("Ankit");
		list.add("Ram");
		list.add("Tom");
		list.add("Jyoti");
		list.forEach((n) -> System.out.println(n));
	}
}
