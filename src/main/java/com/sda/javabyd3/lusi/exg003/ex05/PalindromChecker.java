package com.sda.javabyd3.lusi.exg003.ex05;


import com.sda.javabyd3.lusi.exg003.ex03.Reverse;

/**
 * Napisz program, który pobiera od użytkownika wyraz lub zdanie i sprawdza czy
 * wprowadzony ciąg znaków jest palindromem. Przykładowy palindrom to “kajak” lub
 * “Może jutro ta dama da tortu jeżom”. Program po analizie wyświetla komunikat:
 * Wprowadzony ciąg znaków “<wprowadzone_znaki>” jest palindromem
 * lub
 * Wprowadzony ciąg znaków “<wprowadzone_znaki>” nie jest palindromem
 */
public class PalindromChecker {
    private Reverse reverse;

    public PalindromChecker(Reverse reverse) {
        this.reverse = reverse;
    }

    public Boolean isPalindrom(String text) {
        String textWithoutBlankChar = text.replaceAll("\\s", "").toLowerCase();
        String reversedText = reverse.reverseString(textWithoutBlankChar);
        Boolean isPalindrom = true;
        for (int i = 0; i < textWithoutBlankChar.length(); i++) {
            if (textWithoutBlankChar.charAt(i) != reversedText.charAt(i)) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
