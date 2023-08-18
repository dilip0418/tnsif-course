package com.dilip.dayTenCodes.collectionsDemo.queueDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(5);
		priorityQueue.add(2);

		priorityQueue.add(8); // May throw an exception if the queue is full
		priorityQueue.offer(10); // Returns false if the queue is full
		priorityQueue.offer(2);
		// priorityQueue.offer(null);
		/*
		 * PriorityQueue does not allow null elements. It uses the natural order or a
		 * custom comparator to determine the priority of elements. Since null cannot be
		 * compared, adding null would lead to ambiguity in priority, resulting in
		 * unexpected behavior.
		 */

		System.out.println("Elements in PriorityQueue: " + priorityQueue);
		System.out.println("Front element: " + priorityQueue.peek());

		priorityQueue.poll();

		System.out.println("After removing front element: " + priorityQueue);

		System.out.println("Is PriorityQueue empty? " + priorityQueue.isEmpty());
		System.out.println("Size of PriorityQueue: " + priorityQueue.size());

		System.out.println("Does PriorityQueue contain 2? " + priorityQueue.contains(2));
		System.out.println("Does PriorityQueue contain 10? " + priorityQueue.contains(10));

		Integer[] array = priorityQueue.toArray(new Integer[0]);
		System.out.print("Array representation of PriorityQueue: ");
		for (Integer element : array) {
			System.out.print(element + " ");
		}
		System.out.println();

		priorityQueue.clear();
		System.out.println("Cleared PriorityQueue: " + priorityQueue);
	}
}
