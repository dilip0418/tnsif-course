package com.dilip.dayNineCodes.MultiThreadingDemo;

public class LambdaRunnableExample {
	public static void main(String[] args) {

		/*
		 * The Runnable interface is a functional interface in Java that is commonly
		 * used for creating threads. We can create threads using the Runnable interface
		 * with the help of lambda expressions, which provide a concise way to define
		 * the run() method's implementation inline. This approach allows us to avoid
		 * creating a separate class that implements Runnable, making our code cleaner
		 * and more readable.
		 * 
		 * Usual Doubt where have we used the call to run() method present in Runnable
		 * interface: Explanation: As Runnable is Functional Interface ( Interface
		 * having a single abstract method ) Using the power of lambda expressions we
		 * create a anonymous method implementation and the JVM is so intelligent that
		 * it automatically identifies that this is a lambda expression and herein
		 * there's no requirement for the developer to specify the Runnable class or the
		 * run() method. 
		 */
		// Create and start a thread using lambda expression
		Thread thread1 = new Thread(() -> printCount());
		thread1.start();

		// Create and start another thread using lambda expression
		Thread thread2 = new Thread(() -> printCount());
		thread2.start();
	}

	public static void printCount() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.currentThread();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - Count: " + i);
		}
	}
}
