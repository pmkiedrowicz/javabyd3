package com.sda.javabyd3.kade.DesignPattern.Zad1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) {

        FileIO file = new FileIO();

        try {
            file.BufferedWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void BufferedWriter() throws IOException {

        String fileName = "./fileName.txt";
        String text = "Hello. This is DesignPattern example.";

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(text);
        bw.close();

    }
}