package com.returntypeinterface;
//Using interface as a return type

interface Phone{
	
	public void call();
	public void charge();
}

class MI implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Calling");
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("Sending");
	}
	
}

class PhoneShop{
	public Phone getPhone() {
		MI mi=new MI();
		return mi;
		
	}
}
public class InterfaceAsReturnType {
	
	public static void main(String args[]) {
	
		PhoneShop phoneShop=new PhoneShop();
		Phone p1=phoneShop.getPhone();
		p1.call();
		p1.charge();
	}

}
