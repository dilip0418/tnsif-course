package com.dilip.dayTenCodes.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 25));
		people.add(new Person("Bob", 30));
		people.add(new Person("Charlie", 22));

		// Using a custom comparator to sort by age
		Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
		/*
		 * The :: known as method reference operator in Java, is used to call a method
		 * by referring to it with the help of its class directly. They behave exactly
		 * as the lambda expressions.
		 */
		
		System.out.println("Sorted using age: ");
		Collections.sort(people, ageComparator);
		for (Person person : people)
			System.out.println(person);

		// Using a custom comparator to sort by name
		Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

		System.out.println("Sorted using name: ");
		Collections.sort(people, nameComparator);
		for (Person person : people)
			System.out.println(person);
		

	}
}
