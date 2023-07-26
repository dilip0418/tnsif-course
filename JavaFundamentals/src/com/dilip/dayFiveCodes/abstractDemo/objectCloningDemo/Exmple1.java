package com.dilip.dayFiveCodes.abstractDemo.objectCloningDemo;

class Person implements Cloneable {
	private String name;
	private int age;
	private String phno;

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public Person(String name, int age, String phno) {
		this.name = name;
		this.age = age;
		this.phno = phno;
	}

	public String getPhno() {
		return phno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Exmple1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person person1 = new Person("John", 30, "9880887579");

		System.out.println(person1);

		Person person2 = (Person) person1.clone();

		// Changing the phno of the cloned person
		person2.setPhno("8050060093");

		System.out.println("Original Person: " + person1.getName() + " phone number is " + person1.getPhno());
		System.out.println("Cloned Person: " + person2.getName() + " phone number is " + person2.getPhno());
	}
}
