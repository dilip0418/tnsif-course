package com.dilip.dayThreeCodes.hirerachialInheritance;

public class Person {
	private String name;
	private int age;
	private String nationality;
	private String State;
	private String city;
	private String gender;
		
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
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Person(String name, int age, String nationality, String state, String city, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		State = state;
		this.city = city;
		this.gender = gender;
	}
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("This is a Person!");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nationality=" + nationality + ", State=" + State + ", city="
				+ city + ", gender=" + gender + "]";
	}
	
}
