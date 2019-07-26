package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainEmailValidator {
    public static void main(String[] args) {
        String email;
        Scanner read = new Scanner(System.in);
        email = read.nextLine();
        EmailValidator emailValidator = new EmailValidator();

        if (emailValidator.validate(email)) {
            System.out.println(email + " is correct email");
        } else {
            System.out.println(email + " is not a correct www email");
        }
    }
}
