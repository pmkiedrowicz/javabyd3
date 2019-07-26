package com.sda.javabyd3.lusi.introduction.collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Random random = new Random();
		Queue<Integer> queue = new PriorityQueue<>();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj ilość liczb do wylosowania: ");
		int count = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			queue.add(random.nextInt(100) + 1);
		}
		while (queue.size() > 0) {
			System.out.println("Queue element: " + queue.poll());
		}
	}
}
