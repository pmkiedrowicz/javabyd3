package com.sda.javabyd3.syga.exg003.ex03;

import java.lang.reflect.Array;

public class Reverse {
    public String textReverse(String text) {
        StringBuilder stringBuilder = new StringBuilder();

        if (text != null) {
            stringBuilder.append(text).reverse();
            System.out.println(stringBuilder);
            return stringBuilder.toString();
        } else {
            String wrong = "Nie podano tekstu.";
            System.out.println("Nie podano tekstu.");
            return wrong;
        }
    }
}
