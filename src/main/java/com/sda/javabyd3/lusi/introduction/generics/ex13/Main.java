package com.sda.javabyd3.lusi.introduction.generics.ex13;

public class Main {
	public static void main(String[] args) {
		Clipboard<String> clipboard = new Clipboard<>();
		clipboard.insertIntoClipboard("Jan Kowalski");
		System.out.println(clipboard.getFromClipboard());
	}
}
