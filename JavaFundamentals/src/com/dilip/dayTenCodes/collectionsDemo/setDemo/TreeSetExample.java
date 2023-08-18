package com.dilip.dayTenCodes.collectionsDemo.setDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(6);
		set.add(4);
		set.add(20);
		
		System.out.println(set);
		
		System.out.println();
		/*
		 * try { set.add(null); }catch(NullPointerException e) {
		 * System.err.println(e.getMessage()+ " values aren't accepted in TreeSet"); }
		 * 
		 * finally { System.out.println(set); }
		 */

		/*
		 * ceiling method return the least element that is greater or equal to the given
		 * element (param) returns null if there's no such element
		 */
		System.out.println(set.ceiling(5)); // returns 6 because condition ( 6 is the least greater element than 5 )
		System.out.println();
		// the descendingSet() gives us the descending view of the TreeSet
		NavigableSet<Integer> set1 = set.descendingSet();

		Iterator<Integer> it = set1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();
		// returns the lowest element in the TreeSet
		System.out.println(set.first());

		// returns the highest element in the TreeSet
		System.out.println(set.last());

		System.out.println();
		/*
		 * floor method returns the least element that is less or equal to the given
		 * element (param) returns null if there's no such element
		 */
		System.out.println(set.floor(5)); // return 4 because condition ( 4 is the greatest of all the elements that are
											// less then 5)

		System.out.println();
		
		Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getId));
		// Set<Student> students = new TreeSet<>(Student.idComparator);
		// Set<Student> students = new TreeSet<>(Student.nameComparator);
		// Set<Student> students = new TreeSet<>(Student.ageComparator);
		// Set<Student> students = new TreeSet<>(Student.nameAgeComparator);

		students.add(new Student(101, "Gani", 23));
		students.add(new Student(102, "Shivesh", 23));
		students.add(new Student(103, "Rohith", 22));
		students.add(new Student(104, "Ravi", 25));
		students.add(new Student(105, "Ravi", 21));
		students.add(new Student(106, "Mahesh", 24));

		// System.out.println(students);

		Iterator<Student> it1 = students.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
