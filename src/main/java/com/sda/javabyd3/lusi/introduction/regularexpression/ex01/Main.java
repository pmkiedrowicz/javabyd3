package com.sda.javabyd3.lusi.introduction.regularexpression.ex01;

import static com.sda.javabyd3.lusi.introduction.Utils.displayErrorOnConsole;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;
import static com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper.displayMessageAndGetValue;

public class Main {
    public static void main(String[] args) {
        String number = displayMessageAndGetValue("Podaj liczbę");

        NumberValidator numberValidator = new NumberValidator();

        if (numberValidator.isValid(number)) {
            displayTextOnConsole(String.format("Liczba jest %sparzysta", numberValidator.isOdd(number) ? "nie" : ""));
        } else {
            displayErrorOnConsole("Wprowadzony tekst nie jest liczbą");
        }
    }
}
