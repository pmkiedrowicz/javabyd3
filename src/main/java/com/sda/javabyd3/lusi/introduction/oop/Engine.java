package com.sda.javabyd3.lusi.introduction.oop;

public class Engine {
	Integer capacity;
	Integer horsePower;
	Float fuelConsumption;

	public Engine(Integer capacity, Integer horsePower, Float fuelConsumption) {
		this.capacity = capacity;
		this.horsePower = horsePower;
		this.fuelConsumption = fuelConsumption;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}

	public Float getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Float fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
}
