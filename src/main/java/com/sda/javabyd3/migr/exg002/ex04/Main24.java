package com.sda.javabyd3.migr.exg002.ex04;

import com.sda.javabyd3.migr.exg002.ex03.ScanString;

public class Main24 {

    public static void main(String[] args) {

        ScanString word = new ScanString();
        PolishCharRemover re = new PolishCharRemover();
        System.out.println(re.stripAccents(word.scannString()));
    }
}
