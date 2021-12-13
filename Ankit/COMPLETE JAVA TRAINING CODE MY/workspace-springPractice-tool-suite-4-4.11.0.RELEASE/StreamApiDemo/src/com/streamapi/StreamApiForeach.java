package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiForeach {

	
	public static void main(String args[]) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		Consumer<Integer> c=new Consumer<Integer>() {
 			@Override
			public void accept(Integer i) {
				// TODO Auto-generated method stub
				System.out.println(i);
			}
		};		
		values.forEach(c);
		
		
		
		
		//values.forEach(i->System.out.println(i));
	}
}
