package com.simplilearn.thread;

public class ThreadDemo1 extends Thread {
	
	//method overloading
	public void run() {
		
		System.out.println("Thread Started");
		
		for (int i=0; i<5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 t1= new ThreadDemo1();
		ThreadDemo1 t2= new ThreadDemo1();
		
		t1.start();
		t2.start();
		
	}

}
