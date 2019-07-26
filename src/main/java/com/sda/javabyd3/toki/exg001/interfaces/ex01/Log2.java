package com.sda.javabyd3.toki.exg001.interfaces.ex01;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;

public class Log2 implements Reader {
    private String getName;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void getName() {
        Logger logger = Logger.getLogger(getClass().getName());
        logger.log(Level.INFO, "Put your name here...");
        getName = scanner.nextLine();

        try {
            PrintWriter out=new PrintWriter("C:\\Users\\Master\\Desktop\\Repo\\javabyd3all\\src\\main\\java\\com\\sda\\javabyd3\\toki\\exg001\\interfaces\\ex01\\name.txt");
        out.write(getName);
        out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
