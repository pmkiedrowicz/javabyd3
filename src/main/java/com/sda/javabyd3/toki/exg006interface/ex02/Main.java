package com.sda.javabyd3.toki.exg006interface.ex02;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put the name here: ");
        String name = scanner.next();

        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log(name);

        FileLogger fileLogger = new FileLogger();
        fileLogger.log(name);
    }
}
