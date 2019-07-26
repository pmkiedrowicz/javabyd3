package com.sda.javabyd3.daol.exg001.ex16;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(-18);
        list.add(40);
        list.add(-45);
        list.add(12);
        list.add(0);
        list.add(120);
        final Comparator <Integer> comp = (p1,p2) -> Integer.compare(p1,p2);
        Integer min = list.stream().min(comp).get();
        Integer max = list.stream().max(comp).get();
        System.out.println(min);
        System.out.println(max);
    }
}
