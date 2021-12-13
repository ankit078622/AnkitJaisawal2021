package com.AssInheritence;
class Add1{
	int numone,numtwo;
	void setValueA(int num1,int num2) {
		numone=num1;
		numtwo=num2;
	}
	void result() {
		System.out.println("Sum is : "+(numone+numtwo));
	}
}

class Subtract1 extends Add1{
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
class Multiply1 extends Subtract1{
	int numone,numtwo;
	void setValueC(int num1,int num2) {
		numone=num1;
		numtwo=num2;
	}
	void result() {
		super.result();// we can call parent class method
		System.out.println("Multiplication is : "+(numone*numtwo));
	}
}
public class MultiLevelInheritrence {
	public static void main(String args[]) {
		
		Multiply1 multiply1=new Multiply1();
		multiply1.setValueA(10, 70);
		multiply1.setValueB(80,5);
		multiply1.setValueC(8, 9);
		multiply1.result();
		}

}
