package com.sda.javabyd3.urdu.exg008regex.ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NameValidator nameValidator = new NameValidator();
        Scanner scanName = new Scanner(System.in);

        System.out.println("Podaj dowolne imię: ");
        String name = scanName.next();

        if(nameValidator.isNameCorrect(name)){

            System.out.println("Imię jest poprawne");
        }
        else {
            System.out.println("Imię jest niepoprawne.");
        }

    }
}
