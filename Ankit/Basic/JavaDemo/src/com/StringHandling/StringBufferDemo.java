package com.StringHandling;

public class StringBufferDemo {
	
	public static void main(String args[]) {
		
		String s1="ram";
		String s2=new String("ram");
		StringBuffer s3=new StringBuffer(" hello ");
		
		s3.append("Ram");
		
		System.out.println(s3);
		
	}

}
