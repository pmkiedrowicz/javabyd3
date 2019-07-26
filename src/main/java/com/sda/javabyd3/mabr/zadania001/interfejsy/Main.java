package com.sda.javabyd3.mabr.zadania001.interfejsy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Log1 log1 = new Log1();
        Log2 log2 = new Log2();
        log1.inputName();
        log2.inputName();
    }
}
