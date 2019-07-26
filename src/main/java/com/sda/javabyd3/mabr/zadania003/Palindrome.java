package com.sda.javabyd3.mabr.zadania003;

public class Palindrome {

    public static boolean palindrome(String text) {
        text = text.toLowerCase();
        text = text.replace(" ","");
        text = text.replace(".","");
        text = text.replace(",","");
        text = text.replace("?","");
        text = text.replace("!","");
        text = text.replace(":","");
        text = text.replace("\"","");
        int i, len = text.length();
        StringBuilder dest = new StringBuilder(len);
        for (i = (len - 1); i >= 0; i--){
            dest.append(text.charAt(i));
        }
        String palindrm = dest.toString();
        System.out.println (palindrm);
        if ( palindrm.equalsIgnoreCase( text)) {
            return true;
        }
        else return false;
    }

}
