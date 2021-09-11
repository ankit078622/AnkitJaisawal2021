package com.threads;

class ThreadSleep implements Runnable{

	public void run() {
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		catch(Exception e) {
			System.out.println("exceotion caught" + e);
			
		}
	}
	
}
public class ThreadSleepDemo {
	
	public static void main(String args[]) {
		
			    	
	    	Thread thread=new Thread(new ThreadSleep());
	        thread.start();// life cycle of threads start() call the run method
	    
		}

}
