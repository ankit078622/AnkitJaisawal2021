package com.StringHandling;

import java.util.StringTokenizer;

public class StringTokennizerDemo {

	public static void main(String args[]) {
		
		String s1="I,am,good#hello#this";
		StringTokenizer stringTokennizer=new StringTokenizer(s1,"#");
		//System.out.println(stringTokennizer);
		
		while(stringTokennizer.hasMoreTokens()) {
			System.out.println(stringTokennizer.nextToken());
		}
	}
}
