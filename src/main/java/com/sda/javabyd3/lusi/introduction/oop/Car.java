package com.sda.javabyd3.lusi.introduction.oop;

public abstract class Car {
	String producer;
	String model;
	String color;
	Integer seatsNumber;
	Engine engine;

	public Car() {
		seatsNumber = 2;
	}

	public Car(String producer, String model, String color, Integer seatsNumber, Engine engine) {
		this.producer = producer;
		this.model = model;
		this.color = color;
		this.seatsNumber = seatsNumber;
		this.engine = engine;
	}
}
