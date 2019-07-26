package com.sda.javabyd3.mabr.zadania003;

public class PolishSigns {

    public static String Change(String text){
        char[] letters = text.toCharArray();

        for (int i = 0; i < letters.length; i++){
            if (letters[i] == 'ą') {
                letters[i] = 'a';
            }
            if (letters[i] == 'ć') {
                letters[i] = 'c';
            }
            if (letters[i] == 'ę') {
                letters[i] = 'e';
            }
            if (letters[i] == 'ł') {
                letters[i] = 'l';
            }
            if (letters[i] == 'ó') {
                letters[i] = 'o';
            }
            if (letters[i] == 'ś') {
                letters[i] = 's';
            }
            if (letters[i] == 'ź') {
                letters[i] = 'z';
            }
            if (letters[i] == 'ż') {
                letters[i] = 'z';
            }
        }

        return new String(letters);
    }
}
