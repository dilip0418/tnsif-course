package com.dilip.dayElevenCodes.genericsDemo;
/*
 * creating a class which accepts and process T (generic) type of data
 * T -> is just a letter used to indicate that the class accepts any type of data in general
 * */

class DataProcessor<T> {
	private T data;

	public DataProcessor(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void processData() {
		System.out.println("Processing data: " + data);
	}
}

public class GenericExample1 {
	public static void main(String[] args) {
		
		//Restricting the input to Integer data type only
		DataProcessor<Integer> intProcessor = new DataProcessor<>(42);
		intProcessor.processData();

		//Restricting the input to String data type only
		DataProcessor<String> stringProcessor = new DataProcessor<>("Hello, Generics!");
		stringProcessor.processData();

		//Restricting the input to Double data type only
		DataProcessor<Double> doubleProcessor = new DataProcessor<>(3.14);
		doubleProcessor.processData();
		
		//note: It's the users choice to restrict the type of the data in his/her application
	}
}
