package com.dilip.dayElevenCodes.genericsDemo;

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void displayContents() {
        System.out.println("Box contains: " + item);
    }
}

public class GenericBoxExample {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(42);
        intBox.displayContents();

        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.displayContents();

        Box<Double> doubleBox = new Box<>(3.14);
        doubleBox.displayContents();
    }
}

