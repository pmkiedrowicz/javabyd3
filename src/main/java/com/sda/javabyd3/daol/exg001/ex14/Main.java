package com.sda.javabyd3.daol.exg001.ex14;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Daniel", "Jan", "Marta", "Ewa", "Przemo", "Trelek", "Zibi", "Pati", "Gosia", "Waldasq");
        System.out.println("Lista zawiera imię Jan: " + names.contains("Jan"));
    }
}
