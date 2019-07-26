package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainPasswordValidator {
    public static void main(String[] args) {
        String password;
        Scanner read = new Scanner(System.in);
        password = read.nextLine();
        PasswordValidator passwordValidator = new PasswordValidator();

        if (passwordValidator.validate(password)) {
            System.out.println(password + " is correct password");
        } else {
            System.out.println(password + " is not a correct password");
        }
    }
}
