package com.classobject;

public class WrapperObjectIntoPrimitive {
	public static void main(String args[]) {
		
		Integer in=Integer.valueOf(23);//
		
		Double dobj=Double.valueOf(23.6);
		
		int a=in.intValue();//converted into into
		
		System.out.println(a);
	}

}
