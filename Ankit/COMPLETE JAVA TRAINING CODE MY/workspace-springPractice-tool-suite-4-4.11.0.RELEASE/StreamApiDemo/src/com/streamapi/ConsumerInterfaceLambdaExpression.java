package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceLambdaExpression {

	public static void main(String args[]) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		//Consumer<Integer> c=(Integer i)-> System.out.println(i);
		
		Consumer<Integer> c= i-> System.out.println(i);
		values.forEach(c);
		
		//Or
		
		values.forEach(i->System.out.println(i));
	}
}
