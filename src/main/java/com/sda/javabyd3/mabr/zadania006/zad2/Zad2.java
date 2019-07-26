package com.sda.javabyd3.mabr.zadania006.zad2;

public class Zad2 {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        consoleLogger.log("Log na ekran ");
        fileLogger.log("log do pliku");
    }
}
