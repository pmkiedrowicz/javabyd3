package com.sda.javabyd3.lusi.introduction;

public class Car {
	/**
	 * Car price
	 */
	private Double price;

	/**
	 * Creates car instance
	 *
	 * @param price
	 * 		Car price
	 */
	public Car(Double price) {
		this.price = price;
	}

	/**
	 * Returns car price
	 *
	 * @return Car price
	 */
	public Double getPrice() {
		return price;
	}
}
