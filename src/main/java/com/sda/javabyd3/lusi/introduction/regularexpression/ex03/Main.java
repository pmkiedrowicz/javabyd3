package com.sda.javabyd3.lusi.introduction.regularexpression.ex03;

import com.sda.javabyd3.lusi.introduction.TextColor;
import com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper;

import static com.sda.javabyd3.lusi.introduction.Utils.displayErrorOnConsole;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String login = ConsoleHelper.displayMessageAndGetValue("Wprowadź login");
            if (new LoginValidator().isValid(login)) {
                displayTextOnConsole(TextColor.ANSI_GREEN, "Wprowadzony login %s jest poprawny", login);
            } else {
                displayErrorOnConsole("Wprowadzony login %s jest niepoprawny", login);
            }
        }
    }
}
