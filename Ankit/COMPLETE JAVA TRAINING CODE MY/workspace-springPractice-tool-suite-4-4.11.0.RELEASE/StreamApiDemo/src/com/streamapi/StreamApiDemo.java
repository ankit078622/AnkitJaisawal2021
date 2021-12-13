package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamApiDemo {

	public static void main(String args[]) {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
//		for(int i=0;i<6;i++) {
//			System.out.println(l.get(i));
//		}
		
//		Iterator<Integer> i=values.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for(int i:values) {
//			System.out.println(i);
//		}
		
		//External Iterations
		//Internal Iterations
		
		values.forEach(i->System.out.println(i));
	}
}
