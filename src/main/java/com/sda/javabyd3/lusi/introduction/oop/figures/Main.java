package com.sda.javabyd3.lusi.introduction.oop.figures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj ilość kół: ");
		int numberOfCircles = scanner.nextInt();

		System.out.print("Podaj ilość prostokątów: ");
		int numberOfRectangles = scanner.nextInt();

		System.out.print("Podaj ilość kwadratów: ");
		int numberOfSquares = scanner.nextInt();

		List<Figure> figures = new ArrayList<>();
		Random random = new Random(System.currentTimeMillis());

		for (int i = 0; i < numberOfCircles; i++) {
			figures.add(new Circle(random.nextFloat() * 100));
		}
		for (int i = 0; i < numberOfSquares; i++) {
			figures.add(new Square(random.nextFloat() * 100));
		}
		for (int i = 0; i < numberOfRectangles; i++) {
			figures.add(new Rectangle(random.nextFloat() * 100, random.nextFloat() * 100));
		}
		for (Figure figure : figures) {
			figure.displayArea();
		}
	}
}
