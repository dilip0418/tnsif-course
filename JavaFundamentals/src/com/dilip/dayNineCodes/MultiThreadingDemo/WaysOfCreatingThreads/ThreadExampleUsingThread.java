package com.dilip.dayNineCodes.MultiThreadingDemo.WaysOfCreatingThreads;

//To make a class use threads and Multi-Threading concepts it must extend the Thread class

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - count: " + i);
		}
	}
}

public class ThreadExampleUsingThread {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		// the start method implicitly invokes the run method
		thread1.start();
		thread2.start();

//		isAlive() method return a boolean value saying wether the thread is alive or not
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
	}

}
