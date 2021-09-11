package com.Exception;

//Custom example 
//In this we can create our own exception
class AnkitException extends Exception {

	public AnkitException(String message) {
		super(message);// call this class Exception(String message): Constructs a new exception with
		 // the specified detail message.
	}
}
public class MyAnkitExceptionDemo{

	public static void main(String args[]) {
		
		try {
			throw new AnkitException("My own exception");
		}
		catch(AnkitException e) {
			
			System.out.println("Catch block");
			
		}
	}
}
