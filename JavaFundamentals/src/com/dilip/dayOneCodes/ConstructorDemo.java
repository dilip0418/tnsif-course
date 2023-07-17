package com.dilip.dayOneCodes;

public class ConstructorDemo {
	String name;
	int age;
	
	public ConstructorDemo() {
		super();
	}
	
	public ConstructorDemo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "ConstructorDemo [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo("dilip", 24);
		System.out.println(cd);
		System.out.println(cd1);
	}
	
}
