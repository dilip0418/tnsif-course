package com.dilip.dayFiveCodes.abstractDemo.objectCloningDemo;

class Engine implements Cloneable {
	private int engineCapacity;

	public Engine(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class MotorBike implements Cloneable {
	private String companyName;
	private String modelName;
	private Engine engine;

	public MotorBike(String companyName, String modelName, Engine engine) {
		super();
		this.companyName = companyName;
		this.modelName = modelName;
		this.engine = engine;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getModelName() {
		return modelName;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "MotorBike [companyName=" + companyName + ", modelName=" + modelName + ", engineCapacity ="
				+ engine.getEngineCapacity() + "]";
	}

	// Overiding the clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MotorBike bike = (MotorBike) super.clone();
		bike.engine = (Engine) engine.clone();
		return bike;
	}

}

public class Example2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Engine e = new Engine(350);
		MotorBike b1 = new MotorBike("Royal Enfield", "Classic", e);

		MotorBike b2 = null;
		b2 = (MotorBike) b1.clone();
		// Changing the engineCapacity of the cloned MotorBike object
		b2.getEngine().setEngineCapacity(650);

		System.out.println("Original MotorBike Object: Company Name " + b1.getCompanyName() + " modelName "
				+ b1.getModelName() + " engineCapacity " + b1.getEngine().getEngineCapacity());
		System.out.println("Cloned MotorBike Object: Company Name " + b2.getCompanyName() + " modelName "
				+ b2.getModelName() + " engineCapacity " + b2.getEngine().getEngineCapacity());
	}

}

//Link for better understanding of Shallow and Deep Copy in Java : https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
