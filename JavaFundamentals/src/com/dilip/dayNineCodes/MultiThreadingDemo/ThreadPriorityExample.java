package com.dilip.dayNineCodes.MultiThreadingDemo;

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {			
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" - count: "+i);
		}
		
	}
}

public class ThreadPriorityExample {

	public static void main(String[] args) {
		
		MyRunnable1 myRunnable1 = new MyRunnable1();
		
		Thread t1 = new Thread(myRunnable1);
		Thread t2 = new Thread(myRunnable1);
		
		/*
		 * In Java there three thread priorities namely 
		 * i. MAX_PRIORITY - 10 
		 * ii. NORM_PRIORITY - 5 
		 * iii. MIN_PRIORITY - 1
		 */
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		/*
		 * Note: Setting a thread to high priority doesn't mean that it is the thread
		 * which gets executed first. They are used to hint the thread scheduler. The
		 * order of execution depends on the JVM and the CPU
		 */ 
	}

}
