package com.sda.javabyd3.lusi.introduction.generics.ex13;

public class Clipboard<T> {
	private T element;

	public void insertIntoClipboard(T item) {
		element = item;
	}

	public T getFromClipboard() {
		return element;
	}
}
