package com.simplilearn.thread;

public class ThreadSafetyDemo {
	
	private static Object LOCK = new Object();
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(1000);			//1second=1000millis
			System.out.println(Thread.currentThread().getName()+ " is woke up after 1 seconds of sleep ");
		
		
			synchronized (LOCK) {
				LOCK.wait(5000);
				//LOCK.notify();
				//LOCK.notifyAll();
				System.out.println("Object is woke up after wait of 5 seconds");
			}
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Error Occusred: "+e);
		}
	}

}
