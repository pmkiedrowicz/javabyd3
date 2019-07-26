package com.sda.javabyd3.toki.exg003general.general.ex05;

public class PalindromChecker {
    public String checkForPalindrom(String palindrom, String palindromForEqual) {

        palindrom = new StringBuffer(palindrom).toString().toLowerCase().replaceAll("\\s+", "");
        palindromForEqual = new StringBuffer(palindrom).reverse().toString();
        if (palindrom.equals(palindromForEqual)) {
            System.out.println("This is palindrom: " + palindromForEqual);
//            return true;
        } else {
            System.out.println("It's not palindrom." + palindrom);
//            return false;
        }
        return palindromForEqual;
    }
}
