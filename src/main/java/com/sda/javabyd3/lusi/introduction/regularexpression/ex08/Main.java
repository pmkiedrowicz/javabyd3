package com.sda.javabyd3.lusi.introduction.regularexpression.ex08;

import com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper;

public class Main {
    public static void main(String[] args) {
        String invoiceNumber = ConsoleHelper.displayMessageAndGetValue("Wprowadź numer faktury");
        new InvoiceNumberValidator().validateAndDisplayMessage(invoiceNumber,
                "Wprowadzony numer faktury " + invoiceNumber + " jest poprawny", "Wprowadzony numer faktury " + invoiceNumber + " jest niepoprawny");
    }
}
