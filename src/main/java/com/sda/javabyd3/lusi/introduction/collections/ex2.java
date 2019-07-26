package com.sda.javabyd3.lusi.introduction.collections;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(44);
		list.add(7);
		list.get(8);
		System.out.println("Pierwszy elementy listy: " + list.get(0));
		System.out.println("Ostatni element listy: " + list.get(list.size() - 1));
	}
}
