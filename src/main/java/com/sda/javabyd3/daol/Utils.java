package com.sda.javabyd3.daol;

public class Utils {
    public static void displayTextOnConsole(String text, TextColor color) {
        System.out.println(String.format("%s%s%s", color.getColor(), text, TextColor.ANSI_RESET.getColor()));
    }
}
