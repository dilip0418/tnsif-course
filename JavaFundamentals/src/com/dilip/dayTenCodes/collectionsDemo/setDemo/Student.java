package com.dilip.dayTenCodes.collectionsDemo.setDemo;

import java.util.Comparator;

public class Student {

	private int id;
	private String name;
	private int age;
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	//Single Attribute comparison
	public static Comparator<Student> idComparator = Comparator.comparingInt(Student::getId);
	public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	public static Comparator<Student> ageComparator	= Comparator.comparingInt(Student::getAge);
	
	//Multi Attribute comparison
	public static Comparator<Student> nameAgeComparator = Comparator.comparing(Student::getName).thenComparing(ageComparator);
}
