package com.sda.javabyd3.lusi.introduction.generics.ex14;

/**
 * Clipboard class
 *
 * @param <T>
 * 		Type of element store in clipboard
 */
public class Clipboard<T extends BasePerson> {
	private T element;

	/**
	 * Allows to insert element of type {@link T} into clipboard
	 *
	 * @param item
	 * 		Element of type {@link T} to store in clipboard
	 */
	public void insertIntoClipboard(T item) {
		element = item;
	}

	/**
	 * Gets element from clipboard.
	 *
	 * @return Element
	 */
	public T getFromClipboard() {
		return element;
	}
}
