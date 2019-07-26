package com.sda.javabyd3.urdu.exg008regex.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WwwValidator wwwValidator = new WwwValidator();
        Scanner scanWww = new Scanner(System.in);

        System.out.println("Podaj adres www:");
        String www = scanWww.next();

        if(wwwValidator.validate(www)){

            System.out.println("Adres jest poprawny");
        }
        else {
            System.out.println("Adres jest niepoprawny.");
        }

    }
}
