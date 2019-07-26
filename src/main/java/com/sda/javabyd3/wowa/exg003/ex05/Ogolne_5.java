//Napisz program, który pobiera od użytkownika wyraz lub zdanie i sprawdza czy
//wprowadzony ciąg znaków jest palindromem. Przykładowy palindrom to “kajak” lub
//“Może jutro ta dama da tortu jeżom”. Program po analizie wyświetla komunikat:
//Wprowadzony ciąg znaków “<wprowadzone_znaki>” jest palindromem
//lub Wprowadzony ciąg znaków “<wprowadzone_znaki>” nie jest palindromem

package com.sda.javabyd3.wowa.exg003.ex05;

public class Ogolne_5 {
    public Boolean palindrome(String text) {
        text = text.toLowerCase().replace(" ", "");
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
