package com.sda.javabyd3.lusi.introduction.regularexpression.ex10;

import com.sda.javabyd3.lusi.introduction.regularexpression.ConsoleHelper;

import java.util.Optional;

import static com.sda.javabyd3.lusi.introduction.Utils.displayErrorOnConsole;
import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class Main {
    public static void main(String[] args) {
        String enteredPesel = ConsoleHelper.displayMessageAndGetValue("Wprowadź numer PESEL");
        PeselParser parser = new PeselParser();
        Optional<Pesel> pesel = parser.parsePeselNumber(enteredPesel);
        if (pesel.isPresent()) {
            displayTextOnConsole(pesel.get().toString());
        } else {
            displayErrorOnConsole("Podano niewłaściwy PESEL");
        }
    }
}
