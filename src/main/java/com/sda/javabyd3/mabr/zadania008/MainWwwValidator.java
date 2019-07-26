package com.sda.javabyd3.mabr.zadania008;

import java.util.Scanner;

public class MainWwwValidator {
    public static void main(String[] args) {
        String www;
        Scanner read = new Scanner(System.in);
        www = read.nextLine();
        WwwValidator wwwValidator = new WwwValidator();

        if (wwwValidator.validate(www)) {
            System.out.println(www + " is correct www address");
        } else {
            System.out.println(www + " is not a correct www address");
        }
    }
}
