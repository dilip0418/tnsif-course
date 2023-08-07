package com.dilip.dayNineCodes.MultiThreadingDemo.threadSynchronization;

/*Similar to the synchronized method program here also the synchronized block is said to be a critical section. T
here is very chance of the occurrence of the Race condition.*/

public class SynchronizedBlockExample {

	private int balance;

	//	A lock object is used to specify that the shared resource is currently in use by some thread.
	private Object lock = new Object();

	public void deposit(int amount) {
		synchronized (lock) {
			balance += amount;
			System.out.println(Thread.currentThread().getName() + " - " + balance);
		}
	}

	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) throws InterruptedException {
		SynchronizedBlockExample account = new SynchronizedBlockExample();
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
