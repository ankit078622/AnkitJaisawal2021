package com.Interface;

interface Sum{
	void sumnumber();
}
interface Add{
	void addnumber();
}
class A1 implements Sum,Add{
    int num1=5;
    int num2=9;
	@Override
	public void sumnumber() {
		// TODO Auto-generated method stub
		System.out.println("Sum : "+(num1+num2));
		
	}
	@Override
	public void addnumber() {
		// TODO Auto-generated method stub
		System.out.println("Add : "+(num1+num2));
	}
	
}
public class InterfaceDemo {
	public static void main(String args[]) {
		A1 a1=new A1();
		a1.sumnumber();
		a1.addnumber();
	}

}
