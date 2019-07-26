package com.sda.javabyd3.migr.exg002.ex04;


import java.text.Normalizer;

public class PolishCharRemover {


    public  String stripAccents(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}



