package com.dilip.dayTenCodes.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * List Interface has three collection subclasses in it. 1. ArrayList 2.
		 * LinkedList 3. Vector
		 */

		System.out.println("-------ArrayList---------");
//		1. ArrayList
		List<Integer> list = new ArrayList<Integer>();
//				or 
//		 ArrayList<Integer> list =  new ArrayList<>();

//		operations:

		// i. Insertion
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// inserting at index 0
		list.add(0, 100);

		// ii retrieval
		System.out.println("Element at index no. 5" + list.get(5));

		// iii. update
		System.out.println("List before update: " + list);
		list.set(2, 55);
		System.out.println("List after update: " + list);

		// iv. delete
		// remove by index
		list.remove(0); // deletes element at index 0

		// remove by item value
		list.remove(Integer.valueOf(40)); // removes 40 from the list

		display(list);

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		display(arr);
		System.out.println();

		list.addAll(arr);
		display(list);

		// to retrieve the index of an item in the list
		System.out.println(list.indexOf(20));

		// to check the existence of an item in the list
		System.out.println(list.contains(10));

		// to check whether the list is empty or not
		System.out.println(list.isEmpty());

		// to get the size (number of elements) of the list
		System.out.println(list.size());

		list.add(10);
		// to the last index of an item (if there exists multiple)
		System.out.println(list.lastIndexOf(10));

		// to wipe out all the elements in the list
//		list.clear();

		display(list);

		/*
		 * All the methods except few remain same in the LinkedList collections, however
		 * the TIME COMPLEXITY and SPACE COMPLEXITY change a lot. In LinkedList the
		 * operations like insertion and deletion are O(n) time complexity but in
		 * ArrayList it is O(n). The space taken by n element in ArrayList is n, but in
		 * LinkedList it >n because each item in LinkedList (node) has 2 parts 
		 * i. data ii. address
		 */
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-------LinkedList---------");
		LinkedList<Integer> ll = new LinkedList<>();
		System.out.println(ll.addAll(list));
		
		display(ll);
		System.out.println();
		System.out.println((ll.getFirst()));
		System.out.println((ll.getLast()));

		ll.addFirst(120);
		ll.addLast(420);
		
		System.out.println();
		display(ll);
		
		System.out.println("displaying items using iterator:");
		displayiter(ll);
		
		
		
	}

	public static void displayiter(List<Integer> l) {
		Iterator<Integer> it = l.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
//			it.remove();
		}
	}
	public static void display(List<Integer> l) {
		for (Integer i : l) {
			System.out.println(i);

		}
	}
}
