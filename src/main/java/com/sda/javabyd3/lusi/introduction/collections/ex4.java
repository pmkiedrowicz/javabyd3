package com.sda.javabyd3.lusi.introduction.collections;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Marek");
		names.add("Jan");
		names.add("Marcin");
		names.add("Waldemar");
		names.add("Anna");

		System.out.println("Imiona w kolejności 1-5");
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Imię: " + names.get(i));
		}
		System.out.println("Imiona w kolejności 5-1");
		for (int i = names.size() - 1; i >= 0; i--) {
			System.out.println("Imię: " + names.get(i));
		}

	}
}
