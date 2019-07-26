package com.sda.javabyd3.toki.exg008regex.ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boolean isItTrue = false;
        String password;
        PasswordChecker passwordChecker = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);


        while (isItTrue == false) {
            System.out.println("Put the password, 2 small letters, 2 big letters, one number, one nonWord. Total length 8-16.");
            password = scanner.next();
            if (passwordChecker.validate(password) == true) {
                isItTrue = true;
            }
        }
    }
}
