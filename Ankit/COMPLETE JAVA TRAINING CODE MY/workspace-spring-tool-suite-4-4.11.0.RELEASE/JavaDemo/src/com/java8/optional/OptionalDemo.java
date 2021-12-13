package com.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	Integer sum(Optional<Integer> a, Optional<Integer> b) {
		
		System.out.println("First parameter is present "+a.isPresent());
		System.out.println("Second parameter is present "+b.isPresent());
		
		//Optional or Else - return the value ,
		Integer value1=a.orElse(new Integer(0));
		
		Integer value2=b.get();
		
		return value1+value2;
	}
	
	public static  void main(String args[]) {
		
		OptionalDemo optionalDemo=new OptionalDemo();
		
		Integer value1=null;
		
		Integer value2=new Integer(10);
		
		//Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
 
        //Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);
 
        System.out.println(optionalDemo.sum(a, b));
		
		
	}
}
