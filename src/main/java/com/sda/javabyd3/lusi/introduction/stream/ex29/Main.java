package com.sda.javabyd3.lusi.introduction.stream.ex29;

import com.sda.javabyd3.lusi.introduction.stream.ex28.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        Integer[] balances = {1000, 2000, 3000, 4000, 5000, 7500, 10000};
        stream(balances).forEach(balance -> accounts.add(new BankAccount(balance, "PLN")));
        Optional<BankAccount> account = accounts.stream().max((n1, n2) -> Integer.compare(n1.getBalance(), n2.getBalance()));
        System.out.println("Najwięcej środków ma konto " + account.get().getBalance() + " " + account.get().getName());
    }
}

