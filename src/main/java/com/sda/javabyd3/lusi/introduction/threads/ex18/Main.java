package com.sda.javabyd3.lusi.introduction.threads.ex18;

import java.util.Scanner;

public class Main {
	private static NameStorage nameStorage;

	public static void main(String[] args) {
		nameStorage = new NameStorage();
		MonitorThread monitorThread = new MonitorThread(nameStorage);
		Thread thread = new Thread(monitorThread);
		thread.start();

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Wprowadź imię: ");
			String enteredName = scanner.nextLine();
			nameStorage.setName(enteredName);
			System.out.println();
		}
		while (!nameStorage.getName().equals("koniec"));

		monitorThread.setWorking(false);
	}
}
