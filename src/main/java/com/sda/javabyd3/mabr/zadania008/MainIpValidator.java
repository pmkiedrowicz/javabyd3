package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainIpValidator {
    public static void main(String[] args) {
        String ip;
        Scanner read = new Scanner(System.in);
        ip = read.nextLine();
        IpValidator ipValidator = new IpValidator();

        if (ipValidator.validate(ip)) {
            System.out.println(ip + " is correct ip");
        } else {
            System.out.println(ip + " is not a correct ip");
        }
    }
}
