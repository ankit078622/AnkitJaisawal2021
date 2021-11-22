package com.AssInheritence;
class Add{
	int numone,numtwo;
	void setValueA(int num1,int num2) {
		numone=num1;
		numtwo=num2;
	}
	void result() {
		System.out.println("Sum is : "+(numone+numtwo));
	}
}

class Subtract extends Add{
	int numone,numtwo;
	void setValueB(int num1,int num2) {
		numone=num1;
		numtwo=num2;
	}
	void result() {
		super.result();// we can call parent class method
		System.out.println("Subtraction is : "+(numone-numtwo));
	}
}

public class ExpampleSuperKeyword {
	public static void main(String args[]) {
		Subtract subtract=new Subtract();
		subtract.setValueA(10, 70);
		//subtract.result();
		subtract.setValueB(80,5);
		subtract.result();
		
		
	}

}
