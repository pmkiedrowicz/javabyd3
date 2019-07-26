package com.sda.javabyd3.jaja.designPatternEx.ex01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SingletonLoger singletonLoger = new SingletonLoger();
        singletonLoger.printToFile("text");
    }
}
