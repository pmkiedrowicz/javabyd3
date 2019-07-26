package com.sda.javabyd3.daol.exg001.ex15;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
        public static void main(String[] args) {

            Deque<String> peoples = new ArrayDeque<>();
            String person = "person";
            for (int i = 0; i < 10; i++) {
                peoples.add(person + (i + 1));
            }
            System.out.println("all: \n" + peoples);
            System.out.println("first: " + peoples.getFirst());
            System.out.println("last: " + peoples.getLast());
        }
    }

