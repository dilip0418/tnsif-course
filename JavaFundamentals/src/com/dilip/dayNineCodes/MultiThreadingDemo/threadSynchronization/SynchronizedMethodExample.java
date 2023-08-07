package com.dilip.dayNineCodes.MultiThreadingDemo.threadSynchronization;

/*In this example,the deposit() method is synchronized,
ensuring that only one thread can execute it at a time.
This prevents race conditions while updating the balance.
*/
public class SynchronizedMethodExample {
	private int balance;

	// Shared resource
	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " - " + balance);
	}

	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) throws InterruptedException {
		SynchronizedMethodExample account = new SynchronizedMethodExample();

		/*
		 * Implementing the runnable class with anonymous method and using lambda
		 * expressions
		 */
		Runnable depositTask = () -> {
			for (int i = 0; i < 1000; i++) {
				account.deposit(1);
			}
		};

		Thread thread1 = new Thread(depositTask);
		Thread thread2 = new Thread(depositTask);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("Final Balance: " + account.getBalance());
	}
}

/*
 * Thread synchronization is crucial when multiple threads access shared
 * resources concurrently to avoid issues like race conditions and data
 * inconsistency.
 * 
 * Race Condition : Race conditions are most commonly associated with computer
 * science and programming. They occur when two computer program processes, or
 * threads, attempt to access the same resource at the same time and cause
 * problems in the system.
 */