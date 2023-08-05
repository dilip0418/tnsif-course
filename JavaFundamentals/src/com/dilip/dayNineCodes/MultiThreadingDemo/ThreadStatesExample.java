package com.dilip.dayNineCodes.MultiThreadingDemo;

/*Thread States in Java:
	NEW: The thread has been created but not started yet.
	
	RUNNABLE: The thread is executing or is ready to run.
	
	BLOCKED: The thread is blocked because it's waiting for a monitor 
	lock to enter a synchronized block/method held by another thread.
	
	WAITING: The thread is waiting indefinitely for another thread to perform a particular action.
	
	TIMED_WAITING: Similar to WAITING, but the thread is waiting for a specified period of time.
	
	TERMINATED: The thread has completed its execution.*/

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - count: " + i);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
			System.out.println(e.getMessage());
		}

	}
}

public class ThreadStatesExample {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();

		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);

		System.out.println("Thread 1 State: " + t1.getState());
		System.out.println("Thread 2 State: " + t2.getState());

		t1.start();
		t2.start();

		System.out.println("Thread 1 State after start(): " + t1.getState());
		System.out.println("Thread 2 State after start(): " + t2.getState());

		/*
		 * The interrupt method interrupts the normal execution of a thread and the
		 * thread which interupted raises an exception called as "InterruptedException"
		 * So, In order to handle the exception we enclose the thread operations inside
		 * the try catch blocks The thread operations are methods available for a thread
		 * such as: i. start() ii. sleep() iii. join() iv. wait()
		 */
		// t1.interrupt();

		try {

			/*
			 * The join() method tell to its parent thread (main thread) to wait until its
			 * execution is completed. That is here the main thread waits until the thread
			 * t1 completes its execution
			 */
			
			//Here the main thread stops/waits until t1 and t2 complete there execution
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//main thread restarts its execution again
		System.out.println("Thread 1 State after join(): " + t1.getState());
		System.out.println("Thread 2 State after join(): " + t2.getState());

	}

}