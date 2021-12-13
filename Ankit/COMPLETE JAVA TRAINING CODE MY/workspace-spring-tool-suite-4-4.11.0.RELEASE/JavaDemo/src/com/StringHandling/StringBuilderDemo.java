package com.StringHandling;

public class StringBuilderDemo {
	
	public static void main(String arga[]) {
		StringBuilder s=new StringBuilder("Hello ");
		s.append("Sham");
		System.out.println(s);
		
		String s1="Cat";
		String s2="Cat";
		String s3=new String("Cat");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
