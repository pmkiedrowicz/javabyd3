package com.sda.javabyd3.urdu.designPatternExercises.ex01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        SingletonLoger singletonLoger = SingletonLoger.getInstance();
        singletonLoger.saveLog("Urszula trzeci zapis");
    }
}
