package com.core.java.number;

public class Palindrome {

	public static void main(String[] args) {
		 System.out.println(isPalindrome(121));
	}
	public static boolean isPalindrome(int x) {
		String number=String.valueOf(x);
		String reverse="";
		for(int i=number.length()-1;i>=0;i--) {
			reverse=reverse+number.charAt(i);
		}
		if(number.equals(reverse)) {
			return true;
		}
		return false;
	}

}
