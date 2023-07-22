package com.dilip.dayFourCodes.StaticDemo;

public class Main {
    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 20;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Accessing static variable and static method directly using class name
        System.out.println("Static variable: " + Main.staticVariable);
        Main.staticMethod();

        // Creating an instance of the class to access instance variable and instance method
        Main obj = new Main();
        System.out.println("Instance variable: " + obj.instanceVariable);
        obj.instanceMethod();
    }
}
