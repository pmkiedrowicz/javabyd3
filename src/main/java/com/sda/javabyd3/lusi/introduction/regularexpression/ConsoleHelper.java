package com.sda.javabyd3.lusi.introduction.regularexpression;

import java.util.Scanner;

import static com.sda.javabyd3.lusi.introduction.Utils.displayTextOnConsole;

public class ConsoleHelper {
    public static String displayMessageAndGetValue(String message) {
        Scanner scanner = new Scanner(System.in);
        displayTextOnConsole(message + ": ", false);
        return scanner.nextLine();
    }
}
