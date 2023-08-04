package com.dilip.dayNineCodes.MultiThreadingDemo.WaysOfCreatingThreads;

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - count: " + i);
		}

	}
}

public class ThreadExampleUsingRunnabeDemo {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		
		/*
		 * The MyRunnable object is passed in side the Thread constructor, this is to
		 * associate the run() method of MyRunnable class to the Thread.
		 */		
		
		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		
		t1.start();
		t2.start();
		
	}

}
