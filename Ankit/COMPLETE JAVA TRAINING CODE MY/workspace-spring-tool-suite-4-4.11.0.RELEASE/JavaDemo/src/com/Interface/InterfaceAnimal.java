package com.Interface;
/*
    Properties of interface
    It always contains final data members.
    It cannot be instantiated.
    All methods of interface are abstract and public in nature.
    The class which implements interface need to provide functionality for the methods declare in the interface.
    One can use interface to implement PM (Partial multiple inheritance) and DMD (Dynamic memory dispatch).
    Interface always implements in derived class.
 */
interface InterfaceAnimal {
	
	void body();
	
	void eat();
	
	void travel();

}
class dog implements InterfaceAnimal{

	@Override
	public void body() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
	}
	
}

class rat implements InterfaceAnimal{

	@Override
	public void body() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
	}
	
}
