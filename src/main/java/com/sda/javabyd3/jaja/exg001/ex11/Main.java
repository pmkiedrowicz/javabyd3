package com.sda.javabyd3.jaja.exg001.ex11;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> works = new LinkedList<>();
        works.add("work n.1");
        works.add("work n.2");
        works.add("work n.3");
        works.add("work n.4");
        works.add("work n.5");
        works.add("work n.6");
        works.add("work n.7");
        works.add("work n.8");
        works.add("work n.9");
        works.add("work n.10");
        System.out.println(works);

//////////////////////using for//////////////////////////////////
        LinkedList<String> works2 = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            works2.add("work n." + i);
        }
        System.out.println(works2);
    }
}
