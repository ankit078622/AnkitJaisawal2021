package com.streamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Demo {

	public static void main(String args[]) {
		
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
/*		for (int i=0;i<6;i++) {
			System.out.println(values.get(i));
		}*/
		
	/*	Iterator<Integer>  i=values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		
		//Loops are called as External iteration
		for(int i:values) {
			System.out.println(i);
		}
		
		//External iteration
		//Internal iteration -> it can be achieve with the help of stream api
	}
}
