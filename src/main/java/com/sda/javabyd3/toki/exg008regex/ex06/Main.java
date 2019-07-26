package com.sda.javabyd3.toki.exg008regex.ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put the email here... ");
        String email=scanner.next();

        EmailValidator emailValidator=new EmailValidator();
        System.out.println(emailValidator.validate(email));
        scanner.close();
    }
}
