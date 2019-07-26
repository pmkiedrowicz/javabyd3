package com.sda.javabyd3.mabr.zadania003;

public class Reverse {

    public static String Revers(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }
}
