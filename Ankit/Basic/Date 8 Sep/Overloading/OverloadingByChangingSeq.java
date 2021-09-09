package com.Overloading;

public class OverloadingByChangingSeq {
	
	//for employee 
	void getScore(int empid,String Empname,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//After changing the secquence of empname and empid
	void getScore(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}

	public static void main(String args[]) {
		OverloadingByChangingSeq overloadingByChangingSeq=new OverloadingByChangingSeq();
		overloadingByChangingSeq.getScore(101, "Ankit", 5);
		
		//object second method
		OverloadingByChangingSeq overloadingByChangingSeq1=new OverloadingByChangingSeq();
		overloadingByChangingSeq1.getScore("Amit", 102, 4);
		
		
	}

}
