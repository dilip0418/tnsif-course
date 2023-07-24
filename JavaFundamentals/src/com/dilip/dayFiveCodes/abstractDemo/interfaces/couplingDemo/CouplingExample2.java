package com.dilip.dayFiveCodes.abstractDemo.interfaces.couplingDemo;

interface Parent {  //Creating an interface made us to generalize the method foo to both the classes Sub1 and Sub2
	void foo();			
}

class Sub1 implements Parent {
	// parameterized constructor
	//We can see that any modifications (like adding new methods/features) to Sub1 class will not affect the Sub2 class
	Sub1(int x, int y) {	

	}

	public void foo() {
		System.out.println("In the foo method of class Sub1.");
	}
}

class Sub2 implements Parent {
	public void foo() {
		System.out.println("In the foo method of class Sub2.");
	}
}

public class CouplingExample2 {

// main method   
	public static void main(String argvs[]) {
// creating an object of class Sub2  
		Sub2 obj = new Sub2();
		obj.foo();
	}
}



//For uderstanding the Concept of coupling in a better way goto this webpage: https://www.javatpoint.com/loose-coupling-in-java