package com.threads;
/*
class Table{
	void printTable(int n) {
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

class MyThread1 extends Thread{
	Table t;
    MyThread1(Table t) {
		this.t=t;
	}
    
    public void run() {
    	t.printTable(5);
    }
}

class MyThread2 extends Thread{
	Table t;
    MyThread2(Table t) {
		this.t=t;
	}
    
    public void run() {
    	t.printTable(100);
    }
}

public class ThreaddemoWithoutSynch {
	
	public static void main(String args[]) {
		
		Table obj=new Table();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}

}
*/
public class ThreaddemoWithoutSynch extends Thread {
private static int x;
public synchronized void doThings() {
 int current = x;
 current++;
 x = current;
 }
public void run() {
 doThings();
 }
}

