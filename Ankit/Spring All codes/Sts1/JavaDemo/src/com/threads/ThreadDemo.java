package com.threads;

class ThreadClassDemo extends Thread {
	
	public void run() {
		
		try {
			
			System.out.println("List of thread running"+Thread.currentThread());
			
		}
		catch(Exception e) {
			System.out.println("Exception caught "+e);
		}
				
	}

}
public class ThreadDemo{
	
	public static void main(String args[]) {
	 
		int numberOfThreads=2;
		
		for(int i=0;i<numberOfThreads;i++) {
			
			ThreadClassDemo threadClassDemo=new ThreadClassDemo();
			threadClassDemo.start();// life cycle of threads start() call the run method
			threadClassDemo.setName("Ankit Thread");
		}
	}
	
}