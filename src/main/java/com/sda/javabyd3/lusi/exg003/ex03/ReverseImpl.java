package com.sda.javabyd3.lusi.exg003.ex03;

/**
 * Napisz program, który pobiera od użytkownika wyraz lub zdanie i tworzy z niego
 * odwrotność. Dla słowa “grzegżółka” program zwraca “akłóżgezrg”.
 */
public class ReverseImpl implements Reverse {
    @Override
    public String reverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}
