package com.dilip.dayFiveCodes.abstractDemo.exceptionalInterfaces;

//Example of an interface with a default method implementation inside the interface only.
interface Greeting {
 void sayHello(); // Abstract method

 default void sayHi() {
     System.out.println("Hi there!");
 }
 
 static int add(int a, int b) {
     return a + b;
 }
}

class EnglishGreeting implements Greeting {
 @Override
 public void sayHello() {
     System.out.println("Hello!");
 }
}

public class Main {
 public static void main(String[] args) {
     Greeting englishGreeting = new EnglishGreeting();
     englishGreeting.sayHello(); // Outputs "Hello!"
     englishGreeting.sayHi();    // Outputs "Hi there!"
     
     System.out.println(Greeting.add(5, 15)); //Prints 5 + 15 = 20
 }
}
