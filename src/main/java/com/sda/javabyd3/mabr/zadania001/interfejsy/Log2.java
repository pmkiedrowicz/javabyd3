package com.sda.javabyd3.mabr.zadania001.interfejsy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Log2 implements InterfaceTologin {
    @Override
    public void inputName() {
        Scanner scanner = new Scanner(System.in);
        String inPut;
        log.info("Podaj swoje imie");
        inPut = scanner.nextLine();
        log.info("Podano imie <" + inPut + "> ");
    }
}
