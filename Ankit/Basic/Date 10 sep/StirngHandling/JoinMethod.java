/*
-> The Java String class join() method returns a string joined with a given delimiter. 
-> In the String join() method, the delimiter is copied for each element.
-> The join() method is included in the Java string since JDK 1.8.
 */
package com.StirngHandling;

public class JoinMethod {
	
	public static void main(String args[]) {
		// for date 
		String date=String.join("/", "11","09","2021");
		System.out.println("Dtae : "+date);
		
		String time=String.join(":","9","30 AM");
		System.out.println("Time : "+time);
		
		
	}

}
