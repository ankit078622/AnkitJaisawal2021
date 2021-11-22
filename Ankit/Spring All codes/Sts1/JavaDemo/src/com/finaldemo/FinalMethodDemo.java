package com.finaldemo;

class XYZ{
	/*final void demo() {It is final method so cann't ne override 
		System.out.println("XYZ class method");
	}*/
}

public class FinalMethodDemo extends XYZ {
 
	void demo() {
		System.out.println("ABC class method");
	}
	public static void main(String args[]) {
		FinalMethodDemo obj=new FinalMethodDemo();
		obj.demo();
	}
}
