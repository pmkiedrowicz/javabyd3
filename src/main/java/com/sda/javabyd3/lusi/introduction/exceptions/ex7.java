package com.sda.javabyd3.lusi.introduction.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ex7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(44);
		list.add(11);
		list.add(2);
		list.add(5454);

		try {
			System.out.println(list.get(6));
		} catch (Exception e) {
			System.out.println("Wybrałeś element spoza zakresu");
			e.printStackTrace();
		}
	}
}
