package com.sda.javabyd3.toki.exg008regex.ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String address;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put the IP address here: ");
        address = scanner.next();
        scanner.close();

        IPChecker ipChecker = new IPChecker();
        System.out.println("Checking in task case: " + ipChecker.validate(address));

        System.out.println("Checking in real range 0-255 without leading zero: " + ipChecker.validateInRealRange(address));
    }
}
