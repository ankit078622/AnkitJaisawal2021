package com.threads;

class Table3{
	void printTable(String msg,int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(msg+" "+n*i);
			try {
				Thread.sleep(6000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThreadMessage1 extends Thread{
	Table3 t;
	String message="Amit";
    MyThreadMessage1(Table3 t) {
		this.t=t;
	}
    
    public void run() {
    	t.printTable(message,5);
    }
}

class MyThreadMessage2 extends Thread{
	Table3 t;
	String message="Ankit";
    MyThreadMessage2(Table3 t) {
		this.t=t;
	}
    
    public void run() {
    	t.printTable(message,100);
    }
}
public class ThreaddemoWithoutSynchMessage {
	
	public static void main(String args[]) {
			
		Table3 table3=new Table3();//Creating object
		MyThreadMessage1 myThreadMessage1=new MyThreadMessage1(table3);
		MyThreadMessage2 myThreadMessage2=new MyThreadMessage2(table3);
		myThreadMessage1.start();
		
		myThreadMessage2.start();
	}
	

}
