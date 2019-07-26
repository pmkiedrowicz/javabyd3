package com.sda.javabyd3.lusi.introduction.generics.ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameReader {

	List<String> names = new ArrayList<>();

	public void readNamesFromConsole() {
		Scanner scanner = new Scanner(System.in);
		String name;
		boolean shouldfinish;
		do {
			System.out.print("Podaj imię: ");
			name = scanner.nextLine();

			shouldfinish = "koniec".equals(name);
			if (!shouldfinish) {
				names.add(name);
			}

		} while (!shouldfinish);
	}

	public void displayNames() {
		names.stream().forEach(name -> {
			System.out.println(String.format("%s (%s)", name, name.length()));
		});
	}
}
