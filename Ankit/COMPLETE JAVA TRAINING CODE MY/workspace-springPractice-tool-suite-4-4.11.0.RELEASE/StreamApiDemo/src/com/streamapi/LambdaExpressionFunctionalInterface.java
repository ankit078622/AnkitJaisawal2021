package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionFunctionalInterface {

	public static void main(String args[]) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6); 
		
		values.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer i) {
				// TODO Auto-generated method stub
				System.out.println(i);
			}
			
		});
	}
}
