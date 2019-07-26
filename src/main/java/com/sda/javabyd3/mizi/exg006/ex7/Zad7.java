package com.sda.javabyd3.mizi.exg006.ex7;

/**
 * Created by Michal Ziolecki.
 */
public class Zad7 {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        consoleLogger.log( "Log na ekran " );
        fileLogger.log( "log do pliku" );
    }
}
