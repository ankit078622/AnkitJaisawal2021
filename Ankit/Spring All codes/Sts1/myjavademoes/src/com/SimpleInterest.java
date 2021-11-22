package com;

public class SimpleInterest {
	public static void main(String args[]){
		float principal=(float) 48000.0;
		float rate=(float) 10.0;
		float time=(float) 4.0; //Time is given in year
		float temp=(float) ((principal*rate*time)/100.0);
		System.out.println("Simple Interest of "+principal+" Rs at the rate of "+rate+" % is "+temp+"Rs");
	}

}
