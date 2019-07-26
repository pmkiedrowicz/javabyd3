package com.sda.javabyd3.lusi.introduction.regularexpression.ex05;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper;

import static com.sda.javabyd3.lusi.introduction.Utils.displayErrorOnConsole;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        String date = ConsoleHelper.displayMessageAndGetValue("Wprowadź datę");
        if (new DateValidator().isValid(date)) {
            displayTextOnConsole(TextColor.ANSI_GREEN, "Wprowadzona data %s jest poprawna", date);
        } else {
            displayErrorOnConsole("Wprowadzona data %s jest niepoprawna", date);
        }
    }
}
