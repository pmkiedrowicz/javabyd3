package com.sda.javabyd3.lusi.introduction.oop.figures;

public class Square extends Figure {

	private float sideLength;

	public Square(float sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public float countArea() {
		return sideLength * sideLength;
	}

	@Override
	public void displayArea() {
		System.out.println("Figura: Kwadrat, pole: " + countArea());
	}
}
