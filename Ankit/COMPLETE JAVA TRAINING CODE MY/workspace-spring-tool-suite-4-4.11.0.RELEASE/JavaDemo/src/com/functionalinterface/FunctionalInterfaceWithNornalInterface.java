package com.functionalinterface;


interface Sayable3{
/*Default Methods provide a way to provide a default implementation for a method in an interface.
By providing a default implementation, you can add new methods to your
interface without breaking backwards compatibility for existing code 
that already implements your interfaces.	
*/
	
	default void doit() {
		System.out.println("Hi i am default method");
	}
}
interface Sayable1 extends Sayable3{
	void say(String msg);
}
public class FunctionalInterfaceWithNornalInterface implements Sayable1 {

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		
	}

	public static void main(String args[]) {
		FunctionalInterfaceWithNornalInterface f=new FunctionalInterfaceWithNornalInterface();
		f.say("Hi ! how are u");
		
		f.doit();
	}
	
}
