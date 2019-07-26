package com.sda.javabyd3.toki.exg001.interfaces.ex01;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log1 implements Reader {
    private String getName;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getName() {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.INFO, "Put your name here...");
        getName = scanner.nextLine();
        logger.log(Level.INFO, "Logger name is <" + getName + ">");
    }
}
