package com.dilip.dayFiveCodes.abstractDemo.functionalInterfaces;

@FunctionalInterface
interface MyFunctionalInterface {
	void method();
}

public class Example1 {

	public static void main(String[] args) {
		// Using Lambda expression to implement the functional interface
		MyFunctionalInterface functionalInterfaceLambda = () -> System.out.println("Hello from Lambda!");
		functionalInterfaceLambda.method(); // Outputs "Hello from Lambda!"

		// Using method reference to implement the functional interface
		MyFunctionalInterface functionalInterfaceMethodRef = Example1::printMessage;
		functionalInterfaceMethodRef.method(); // Outputs "Hello from Method Reference!"
	}

	public static void printMessage() {
        System.out.println("Hello from Method Reference!");
    }
}
