package com.example.demo.spring;

public class Car {
	private Engine engine;
	private String carName;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printCarDetails() {
		System.out.println("Car name: "+carName);
		System.out.println("Model name: "+engine.getModel());
	}
}
