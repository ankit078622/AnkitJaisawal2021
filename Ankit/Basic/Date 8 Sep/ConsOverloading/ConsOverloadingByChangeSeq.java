package com.ConsOverloading;

public class ConsOverloadingByChangeSeq {
	
	//for employee 
	ConsOverloadingByChangeSeq(int empid,String Empname,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//After changing the secquence of empname and empid
	ConsOverloadingByChangeSeq(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//Main method
	public static void main(String args[]) {
		ConsOverloadingByChangeSeq consOverloadingByChangeSeq=new ConsOverloadingByChangeSeq(101, "Anurag", 4);
		ConsOverloadingByChangeSeq consOverloadingByChangeSeq2=new ConsOverloadingByChangeSeq("Amit", 102, 4);
	}

}
