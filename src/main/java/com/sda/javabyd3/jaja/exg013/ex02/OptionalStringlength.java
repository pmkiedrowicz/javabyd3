package com.sda.javabyd3.jaja.exg013.ex02;

import java.util.Optional;

public class OptionalStringlength {
    public static void main(String[] args) {
        String text = null;
        String text2 = "Jagoda";

        Optional<String> textLenght = Optional.ofNullable(text);
        System.out.println(textLenght.map(String::length));
        System.out.println(textLenght.orElse("-1"));

        Optional<String> text2Lenght = Optional.ofNullable(text2);
        System.out.println(text2Lenght.map(String::length));
        System.out.println(text2Lenght.orElse("-1"));
    }
}
