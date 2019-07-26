//Napisz program, który pobiera od użytkownika wyraz lub zdanie i tworzy z niego
//odwrotność. Dla słowa “grzegżółka” program zwraca “akłóżgezrg”.

package com.sda.javabyd3.wowa.exg003.ex03;

public class Ogolne_3 {
    public String reverseString(String text) {
        String reversedString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString += text.charAt(i);
        }
        return reversedString;
    }
}
