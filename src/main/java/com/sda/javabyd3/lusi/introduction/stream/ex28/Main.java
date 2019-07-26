package com.sda.javabyd3.lusi.introduction.stream.ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<BankAccount> accounts = new ArrayList<>();
//		Integer[] balances = {1000, 2000, 3000, 4000, 5000, 7500, 10000};
//		com.sda.java.exercises.stream(balances).forEach(balance -> accounts.add(new BankAccount(balance, "PLN")));

		accounts.add(new BankAccount(1000, "PLN"));
		accounts.add(new BankAccount(2000, "PLN"));
		accounts.add(new BankAccount(3000, "PLN"));
		accounts.add(new BankAccount(4000, "PLN"));
		accounts.add(new BankAccount(5000, "PLN"));
		accounts.add(new BankAccount(7500, "PLN"));
		accounts.add(new BankAccount(10000, "PLN"));

		List<BankAccount> filteredAccounts = accounts.stream()
				.filter(account -> account.balance > 5000)
				.collect(Collectors.toList());

		filteredAccounts.forEach(account -> System.out.println(account.balance));
	}
}
