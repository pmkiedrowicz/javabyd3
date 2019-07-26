package com.sda.javabyd3.lusi.introduction.regularexpression.ex02;

import static com.sda.javabyd3.lusi.introduction.Utils.displayErrorOnConsole;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;
import static com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper.displayMessageAndGetValue;

public class Main {
    public static void main(String[] args) {
        String postCode = displayMessageAndGetValue("Podaj kod pocztowy");

        if (new PostCodeValidator().isPostodeValid(postCode)) {
            displayTextOnConsole("Wprowadzony kod pocztowy %s jest poprawny", postCode);
        } else {
            displayErrorOnConsole("Wprowadzony kod pocztowy %s jest błędny", postCode);
        }
    }
}
