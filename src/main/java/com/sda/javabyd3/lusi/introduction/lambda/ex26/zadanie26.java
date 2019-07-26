package com.sda.javabyd3.lusi.introduction.lambda.ex26;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;

public class zadanie26 {
	private static String[] names = {"Jan", "Małgorzata", "Marek", "Wojciech",
			"Jagoda", "Urszula", "Karol", "Kamil", "Michał", "Tomasz"};

	public static void main(String[] args) {
		System.out.println("--== Original list before sorting ==--");
		asList(names).forEach(element -> System.out.println(element + " "));
		sortByLengthAcs();
		sortByLengthDesc();
		sortByFirstLetter();
	}

	public static void sortByLengthAcs() {
		System.out.println("--== Sorting by name length ACS ==--");
		List<String> sortedNames = stream(names)    // Utwórz com.sda.java.exercises.stream
				.sorted((name1, name2) -> Integer.compare(name1.length(), name2.length()))    // sortuj
				.collect(Collectors.toList());
		sortedNames.forEach(element -> System.out.println(element + " "));
	}

	public static void sortByLengthDesc() {
		System.out.println("--== Sorting by name length DESC ==--");
		List<String> sortedNames = stream(names)    // Utwórz com.sda.java.exercises.stream
				.sorted((name1, name2) -> Integer.compare(name2.length(), name1.length()))    // sortuj
				.collect(Collectors.toList());
		sortedNames.forEach(element -> System.out.println(element + " "));
	}

	public static void sortByFirstLetter() {
		System.out.println("--== Sorting by first letter ==--");
		List<String> sortedNames = stream(names)    // Utwórz com.sda.java.exercises.stream
				.sorted((name1, name2) -> Character.compare(name1.charAt(0), name2.charAt(0)))    // sortuj
				.collect(Collectors.toList());
		sortedNames.forEach(element -> System.out.println(element + " "));
	}
}
