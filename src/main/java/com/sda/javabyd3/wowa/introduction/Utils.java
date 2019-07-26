package com.sda.javabyd3.wowa.introduction;

import java.util.Scanner;

public class Utils
{
    public static void displayTextOnConsole(String text) {
        System.out.println(text);
    }

    public static void displayTextOnConsole(String text, String... args) {
        System.out.println(String.format(text, args));
    }

    public static void displayTextOnConsole(TextColor color, String text, String... args) {
        displayTextOnConsole(String.format(text, args), color);
    }

    public static void displayTextOnConsole(String text, Boolean newLine) {
        if (newLine) {
            System.out.println(text);
        } else {
            System.out.print(text);
        }
    }

    public static void displayTextOnConsole(String text, TextColor color) {
        System.out.println(String.format("%s%s%s", color.getColor(), text, TextColor.ANSI_RESET.getColor()));
    }

    public static void displayErrorOnConsole(String text) {
        displayTextOnConsole(text, TextColor.ANSI_RED);
    }

    public static void displayErrorOnConsole(String text, String... args) {
        displayTextOnConsole(String.format(text, args), TextColor.ANSI_RED);
    }

    public static String displayTextAndGetValue(String text, Boolean newLine) {
        Scanner scanner = new Scanner(System.in);
        displayTextOnConsole(text, newLine);
        return scanner.nextLine();
    }
}
