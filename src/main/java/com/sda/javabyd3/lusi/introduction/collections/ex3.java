package com.sda.javabyd3.lusi.introduction.collections;

import java.util.ArrayList;
import java.util.List;

public class ex3 {

	public static void main(String[] args) {
		List<Float> list = new ArrayList<>();
		list.add(3.5f);
		list.add(44f);
		list.add(1.13f);
		list.add(3.14f);
		list.add(1.444f);
		list.add(2.236067978f);
		list.add(4.5f);
		list.add(34.4f);
		list.add(123.55f);
		list.add(33.78f);

		String.format("Suma pierwszego i ostatniego elementu: " + list.get(0) + list.get(list.size() - 1));
		String.format("Iloczyn pierwszego i ostatniego elementu: " + list.get(0) * list.get(list.size() - 1));
		String.format("Iloraz pierwszego i ostatniego elementu: " + list.get(1) + list.get(list.size() - 2));

	}
}
