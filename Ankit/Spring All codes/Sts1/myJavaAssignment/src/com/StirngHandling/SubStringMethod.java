/*
->The Java String class substring() method returns a part of the string.
->We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive,
  and endIndex is exclusive. In other words, the beginIndex starts from 0, whereas the endIndex starts from 1.
 */
package com.StirngHandling;

public class SubStringMethod {
	
	public static void main(String args[]) {
		
		String s="Hi i am  a java programmer";
		System.out.println(s.substring(3));
		
		System.out.println(s.substring(16,23));
	}

}
