package com.sda.javabyd3.lusi.introduction.regularexpression.ex07;

import com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper;

public class Main {
    public static void main(String[] args) {
        String serialNumber = ConsoleHelper.displayMessageAndGetValue("Wprowadź numer seryjny");
        new SerialLicenceValidator().validateAndDisplayMessage(serialNumber,
                "Wprowadzony numer seryjny " + serialNumber + " jest poprawny", "Wprowadzony numer seryjny " + serialNumber + " jest niepoprawny");
    }
}
