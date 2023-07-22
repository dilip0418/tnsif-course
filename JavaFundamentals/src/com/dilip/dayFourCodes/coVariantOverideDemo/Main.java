package com.dilip.dayFourCodes.coVariantOverideDemo;

//Superclass Animal
class Animal {
 public Animal reproduce() {
     System.out.println("Animal is reproducing.");
     return new Animal();
 }
}

//Subclass Dog
class Dog extends Animal {
//Co-variant Method Reproduce
 @Override
 public Dog reproduce() {
     System.out.println("Dog is reproducing.");
     return new Dog();
 }
}

public class Main {

	public static void main(String[] args) {
		//Animal class method.
		Animal a = new Animal();
		System.out.println(a.reproduce());
		
		//Dog class overridden.
		Dog d = new Dog();
		System.out.println(d.reproduce());
	}

}
