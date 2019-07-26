package com.sda.javabyd3.daol.exg001.ex11;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue <String> tasks = new ArrayDeque<String>(10);
        tasks.add("1: Weź długopis");
        tasks.add("2: Zetrzyj kurze");
        tasks.add("3: Odkurz");
        tasks.add("4: Zamieć");
        tasks.add("5: Wyrzuć śmieci");
        tasks.add("6: Pościel łóżko");
        tasks.add("7: Zrób zakupy");
        tasks.add("8: Wyprowadź psa");
        tasks.add("9: Zatankuj auta");
        tasks.add("10: Umyj podłogi");

        System.out.println(tasks.toArray());
    }
}
