package com.threads;

class Table2{
	synchronized void printTable2(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(6000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class MyThread3 extends Thread{
	Table2 t;
    MyThread3(Table2 t) {
		this.t=t;
	}
    
    public void run() {
    	t.printTable2(5);
    }
}

class MyThread4 extends Thread{
	Table2 t;
    MyThread4(Table2 t) {
		this.t=t;
	}
    
    public void run() {
    	t.printTable2(100);
    }
}

public class ThreadDemoWithSynhDemo {
	
	public static void main(String args[]) {
		
		Table2 obj=new Table2();//object
		MyThread3 myThread3=new MyThread3(obj);
		MyThread4 myThread4=new MyThread4(obj);
		
		myThread3.start();
		myThread4.start();
	}

}
