package com.dilip.dayTenCodes.collectionsDemo.queueDemo;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeMethodsExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);

        System.out.println("Deque: " + deque);
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Rear element: " + deque.peekLast());

        deque.removeFirst();
        System.out.println("After removing front element: " + deque);

        System.out.println("Is deque empty? " + deque.isEmpty());
        System.out.println("Size of deque: " + deque.size());

        deque.clear();
        System.out.println("Cleared deque: " + deque);
    }
}
