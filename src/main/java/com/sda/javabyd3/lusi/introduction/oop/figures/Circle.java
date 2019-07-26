package com.sda.javabyd3.lusi.introduction.oop.figures;

public class Circle extends Figure {

	private float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public float countArea() {
		return (float) Math.PI * radius * radius;
	}

	@Override
	public void displayArea() {
		System.out.println("Figura: Koło, pole: " + countArea());
	}
}
