package com.dilip.dayTenCodes.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// overriding compareTo method of Comparable class
	@Override
	public int compareTo(Person otherPerson) {
		return Integer.compare(this.age, otherPerson.age);
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 25));
		people.add(new Person("Bob", 30));
		people.add(new Person("Charlie", 22));

		Collections.sort(people); // The sort method of Collections class implicitly uses the comareTo() method

		for (Person person : people) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
	}
}
