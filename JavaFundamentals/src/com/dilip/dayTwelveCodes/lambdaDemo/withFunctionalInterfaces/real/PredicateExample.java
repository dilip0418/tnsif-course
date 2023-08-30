package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.real;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*
 * Here in this program below I have tired to demonstrate the 
 * filter by feature that is available in most of the applications.
 * The employee list is filtered with respect to the predicate.
 */

class Employee {
	String name;
	int age;

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class PredicateExample {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alice", 30));
		employees.add(new Employee("Bob", 25));
		employees.add(new Employee("Charlie", 40));

		Predicate<Employee> ageFilter = employee -> employee.age >= 30;
		System.out.println("Employees above 30:");
		for (Employee employee : employees) {
			if (ageFilter.test(employee)) {
				System.out.println(employee.name);
			}
		}
	}
}
