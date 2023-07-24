package com.dilip.dayFiveCodes.abstractDemo.interfaces.couplingDemo;

class A {
	
	// a parameterized constructor leads to tight coupling of class B with class A and leads to compilation errors.
/*	A(int x, int y)  
	{  
	      
	}  
*/	
	void a() {
		System.out.println("Inside the foo method of base class.");
	}
}

// child or derived class  
class B extends A {
	@Override
	void a() {
		System.out.println("Inside the foo method of derived class.");
	}
}

public class CouplingExample1 {

	// main method
	public static void main(String argvs[]) {

		// creating an object of class B
		B obj = new B();
		obj.a();
	}

}
