package com.sda.javabyd3.lusi.introduction.oop.figures;

public class Rectangle extends Figure {

	private float sideA;
	private float sideB;

	public Rectangle(float sideA, float sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public float countArea() {
		return sideA * sideB;
	}

	@Override
	public void displayArea() {
		System.out.println("Figura: RectangleParameters, pole: " + countArea());
	}
}
