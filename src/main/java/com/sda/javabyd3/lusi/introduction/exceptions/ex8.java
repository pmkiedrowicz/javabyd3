package com.sda.javabyd3.lusi.introduction.exceptions;

public class ex8 {
	public static void main(String[] args) {
		String name = "Olgierd";
		System.out.println("Imię: " + name.toUpperCase());
		System.out.println("Imię: " + name.toLowerCase());
		System.out.println("Długość imienia: " + name.length());
		System.out.println("Czy imię rozpoczyna się od 'O': " + (name.startsWith("O") ? "tak" : "nie"));
		System.out.println("Czy imię zawiera literę 'e': " + (name.contains("e") ? "tak" : "nie"));
		System.out.println("Imię po usunięciu 'i' oraz 'e': " + name.replace("i", "").replace("e", ""));

		for (int i = 0; i < name.length(); i++) {
			System.out.println(String.format("[%d] = %s", i, name.charAt(i)));
		}
	}
}
