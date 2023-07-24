package com.dilip.dayFiveCodes.abstractDemo.interfaces.program1;

//Interface representing a shape
interface Shape {
 void calculateArea(); // Abstract method for calculating the area of the shape
}

//Concrete class representing a circle
class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Area of Circle: " + area);
 }
}

//Concrete class representing a rectangle
class Rectangle implements Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public void calculateArea() {
     double area = length * width;
     System.out.println("Area of Rectangle: " + area);
 }
}

public class Main {
 public static void main(String[] args) {
     Shape circle = new Circle(5.0);
     Shape rectangle = new Rectangle(4.0, 6.0);

     // Using abstraction to treat both shapes generically
     circle.calculateArea(); // Outputs the area of the circle
     rectangle.calculateArea(); // Outputs the area of the rectangle
 }
}
